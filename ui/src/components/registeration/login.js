import React,{useState,useEffect} from 'react';

import {Card,Button} from 'react-bootstrap';
import {TextField} from '@material-ui/core/';

import validator from 'validator';

export default function Login(props){


    const [username,setUsername] = useState();
    const [password,setPassword] = useState();


    const [isLoggedIn,setisLoggedIn] = useState(false);

    useEffect(()=>{
        if ( localStorage.getItem('userName') )
        {
            setisLoggedIn(true)
            setUsername(localStorage.getItem('userName'))
            props.history.push('/about')
        }
    })

    const onLogin=()=>{


    }



    return (
        <>

            <center>

                <div class='card' style={{alignItems:'center'}}>



                    <Card  bgstyle={{ width: '18rem' , border: 'none'}} >

                        <div className={'row'}>

                            <div className={'col-md-7'}>
                                <img src={process.env.PUBLIC_URL + '/Meditation.PNG'} />
                            </div>

                            <div className={'col-md-5'}>

                                <h3 style={{fontSize:'20px', backgroundColor: 'white !important'}}> <b> <strong> Login </strong></b>  </h3>

                                <Card.Body>

                                    <TextField
                                        required
                                        style={{background:'white !important'}}
                                        color={"secondary"}
                                        label="Username"
                                        // variant="filled"
                                        value={username}
                                        onChange={(e)=>setUsername(e.target.value)}
                                    />

                                    <br/>
                                    <br/>

                                    <TextField
                                        required
                                        style={{background:'white !important'}}
                                        color={"secondary"}
                                        label="Password"
                                        // variant="filled"
                                        type={"password"}
                                        value={password}
                                        onChange={(e)=>setPassword(e.target.value)}

                                    />

                                    <br/>
                                    <br/>

                                    <Button style={{width:'100px'}} type="button" variant="success" onClick={()=>{
                                        onLogin()
                                    }}> Signup </Button>

                                    <br/>
                                    <br/>

                                    <p onClick={()=>props.history.push('/signup')}> New User Sign Up Here </p>


                                </Card.Body>
                            </div>

                        </div>
                    </Card>





                </div>
            </center>


        </>
    )


}
