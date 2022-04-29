import { useEffect, useState } from "react";

function Home() {
    const [products,setProducts] = useState([]);   // Reacti erikood -> 
                        //muutuja (HTMLi), funktsioon (HTMLi uuendamiseks), algväärtus (tühi massiiv)

    useEffect(()=>{
        fetch("http://localhost:8080/products")
        .then(response => response.json())
        .then(body => setProducts(body));
    },[]);    // useEffect --> Reacti erikood
    

    return (
        products.map( element => 
                        <div>
                            <img src={element.imgSrc} alt="" />
                            <div>{element.name}</div>
                            <div>{element.price}</div>
                            <div>{element.id}</div>
                            <div>{element.active}</div>
                            <div>{element.description}</div>
                        </div> )
    )
}

export default Home;