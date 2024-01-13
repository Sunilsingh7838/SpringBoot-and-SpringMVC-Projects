import React from 'react'
import img4 from './images/img4.jpg'
import "react-responsive-carousel/lib/styles/carousel.min.css";
import { Carousel } from 'react-responsive-carousel';

export default function AboutUs(){

    return(
        <>
        <header>
          <div
         className="p-5 text-center bg-image"
         src={img4}
           height=" 400px"/>
           </header>
{/* <Carousel>
<div>
                    <img  className="p-5 text-center bg-image"src={img4}  alt="img1"  />
                </div>
                </Carousel> */}
      
        <p>
            Lorem ipsum dolor sit amet consectetur adipisicing elit. Voluptatum pariatur rerum sunt cupiditate ad ullam, neque libero perferendis repellendus sapiente iure perspiciatis debitis placeat exercitationem dicta, id corrupti suscipit blanditiis.
        </p>
        </>
    )
}