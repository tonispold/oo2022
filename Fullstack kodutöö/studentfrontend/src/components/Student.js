import React, { useEffect, useState } from 'react';
import { makeStyles } from '@material-ui/core/styles';
import TextField from '@material-ui/core/TextField';
import { Container,Paper,Button} from '@material-ui/core';

const useStyles = makeStyles((theme) => ({
  root: {
    '& > *': {
      margin: theme.spacing(1),
    },
  },
}));

export default function Student() {
  const paperStyle = {
    padding:'50px 20px',
    width:600,
    margin:"20px auto"
  }
  const [name, setName] = useState('')
  const [address, setAddress] = useState('')
  const [students, setStudents] = useState([])
  const classes = useStyles();

  const handleSave = (e) => {
    const student = {
      name,
      address
    }
    console.log(student)
    fetch("http://localhost:8080/student/add",{
      method:"POST",
      headers:{"Content-Type":"application/json"},
      body:JSON.stringify(student)
    }).then(() => {
      getStudents()
      setName("")
      setAddress("")
      console.log("New Student added")
    })
  }

  const handleDelete = (id) => {
    fetch(`http://localhost:8080/student/${id}`,{
      method:"DELETE",
      headers:{"Content-Type":"application/json"}
    }).then(() => {
      getStudents()
      console.log("Student deleted!")
    })
  }

  const getStudents = () => {
    fetch("http://localhost:8080/student/getAll")
    .then(res => res.json())
    .then((result) => {
      setStudents(result);
    })
  }

  useEffect(() => {
    getStudents()
  }, [])

  return (
  <Container>
    <Paper elevation={3} style={paperStyle}>
      <h1 style={{color:"blue"}}><u>Add Student</u></h1>
      <form className={classes.root} noValidate autoComplete="off">
        <TextField id="outlined-basic" label="Student Name" variant="outlined" fullWidth 
          value={name}
          onChange={(e)=>setName(e.target.value)}
        />
        <TextField id="outlined-basic" label="Student Address" variant="outlined" fullWidth
          value={address}
          onChange={(e)=>setAddress(e.target.value)}
        />
        <Button type="button" variant="contained" color="primary" onClick={handleSave}>
          Submit
        </Button>
      </form>
    </Paper>

    <h1>Students</h1>
    <Paper elevation={3} style={paperStyle}>
      {students.map(student=>(
        <Paper elevation={6} style={{margin:"10px",padding:"15px", textAlign:"left", display:"flex", justifyContent:"space-between", alignItems:"center"}} key={student.id}>
          <div>
            Id:{student.id}<br/>
            Name:{student.name}<br/>
            Address:{student.address}
          </div>
          <Button type="button" variant="contained" color="secondary" onClick={() => handleDelete(student.id)}>
            Delete
          </Button>
        </Paper>
      ))}
    </Paper>
  </Container>
  );
}