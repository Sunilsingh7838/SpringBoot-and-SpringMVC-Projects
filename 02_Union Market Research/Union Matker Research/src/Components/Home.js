import React from 'react'
import imglogo from './images/imglogo.png'
import img2 from './images/img2.jpg'
import img3 from './images/img3.jpg'
import img4 from './images/img4.jpg'
import img5 from './images/img5.jpg'
// import React, { Component } from 'react';
import "react-responsive-carousel/lib/styles/carousel.min.css";
import { Carousel } from 'react-responsive-carousel';



export default function Home(){

    
    return(
        <>

           <Carousel>
                <div>
                    <img src={img4}  alt="img1"  />
                </div>
                <div>
                    <img src={imglogo} alt="img1" />
                </div>
                <div>
                    <img src={img2} alt="img1"/>
                </div>
                <div>
                    <img src={img3} alt="img1"/>
                </div>
                <div>
                    <img src={img5} alt="img1"/>
                    <p className="legend">Legend 3</p>
                </div>
            </Carousel>
        </>
    )
};
// ReactDOM.render(<Carousel />, document.querySelector('.demo-carousel'));