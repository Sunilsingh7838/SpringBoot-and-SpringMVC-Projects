// import React from 'react'
// import PropTypes from 'prop-types'
import{Link} from 'react-router-dom'
import img from './images/img.ico'
import React, { useState } from 'react';
import {
  MDBContainer,
  MDBNavbar,
  MDBNavbarBrand,
  MDBNavbarToggler,
  MDBIcon,
  MDBNavbarNav,
  MDBNavbarItem,
  MDBNavbarLink,
  MDBBtn,
  MDBDropdown,
  MDBDropdownToggle,
  MDBDropdownMenu,
  MDBDropdownItem,
  MDBCollapse,
} from 'mdb-react-ui-kit';
export default function Navbar() {
    const [showBasic, setShowBasic] = useState(false);
    return (
        <>
            {/* <nav className="navbar navbar-expand-lg bg-body-tertiary" data-bs-theme="dark">
                <div className="container-fluid">
                    <Link className="navbar-brand" to="./">
                        <img src={img} alt="Logo" width="95" height="45" className="d-inline-block align-text-top"/>
                    </Link>
                    <a className="navbar-brand">Health Lab</a>
                    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll" aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
                        <span className="navbar-toggler-icon"></span>
                    </button>
                    <div className="collapse navbar-collapse" id="navbarNavAltMarkup">
                        <div className="navbar-nav">
                            <Link className="nav-link active" aria-current="page" to="/Home">Home</Link>
                            <a className="nav-link active" aria-current="page"to="#">Services</a>
                            <a className="nav-link active"aria-current="page" to="#">Contact</a>
                            <Link className="nav-link active" aria-current="page"to="/AboutUs">About Us</Link>
                        </div>
                    </div>
                    <form className="d-flex" role="search">
                        <input className="form-control me-2" type="search" placeholder="Search" aria-label="Search"/>
                        <button className="btn btn-outline-success" type="submit">Search</button>
                    </form>
                </div>
            </nav> */}



  <MDBNavbar expand='lg' dark bgColor='dark'>
    <MDBContainer fluid>
    <Link className="navbar-brand" to="./">
              <img src={img} alt="Logo" width="95" height="45" className="d-inline-block align-text-top"/>
            </Link>
      <MDBNavbarBrand to='/'>Union Market Research</MDBNavbarBrand>

      <MDBNavbarToggler
        aria-controls='navbarSupportedContent'
        aria-expanded='false'
        aria-label='Toggle navigation'
        onClick={() => setShowBasic(!showBasic)}
      >
        <MDBIcon icon='bars' fas />
      </MDBNavbarToggler>

      <MDBCollapse navbar show={showBasic}>
        <MDBNavbarNav className='mr-auto mb-2 mb-lg-0'>
          <MDBNavbarItem>
            {/* <MDBNavbarLink active aria-current="page" to="/Home">
              Home
            </MDBNavbarLink> */}
                 <Link className="nav-link active" aria-current="page" to="/Home">Home</Link>
          </MDBNavbarItem>
          <MDBNavbarItem>
          <Link className="nav-link active" aria-current="page"to="/AboutUs">About Us</Link>
          </MDBNavbarItem>
          <MDBNavbarItem>
          <Link className="nav-link active"aria-current="page" to="/Contact">Contact</Link>
          </MDBNavbarItem>
          <MDBNavbarItem>
            <MDBNavbarLink to='#'>Link</MDBNavbarLink>
          </MDBNavbarItem>

          <MDBNavbarItem>
            <MDBDropdown>
              <MDBDropdownToggle tag='a' className='nav-link' role='button'>
                Dropdown
              </MDBDropdownToggle>
              <MDBDropdownMenu>
                <MDBDropdownItem link>Action</MDBDropdownItem>
                <MDBDropdownItem link>Another action</MDBDropdownItem>
                <MDBDropdownItem link>Something else here</MDBDropdownItem>
              </MDBDropdownMenu>
            </MDBDropdown>
          </MDBNavbarItem>

        </MDBNavbarNav>

        <form className='d-flex input-group w-auto'>
          <input type='search' className='form-control' placeholder='Search Here' aria-label='Search' />
          <MDBBtn color='primary'>Search</MDBBtn>
        </form>
      </MDBCollapse>
    </MDBContainer>
  </MDBNavbar>
        </>
    );
}
    // Navbar.propTypes = {title:PropTypes.string,
    //     About: PropTypes.string }