// import React, { useState } from 'react';
// import styled from 'styled-components';
// import adm from "../assets/images/admin.png";
// import dc from "../assets/images/link1.jpeg";

// const FormContainer = styled.form`
//   max-width: 300px;
//   margin: 0 auto;
//   padding: 20px;
//   background-color: #fff;
//   border-radius: 8px;
//   box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
// `;

// const Label = styled.label`
//   display: block;
//   margin-bottom: 10px;
// `;

// const Input = styled.input`
//   width: 100%;
//   padding: 8px;
//   margin-bottom: 15px;
//   border: 1px solid #ccc;
//   border-radius: 4px;
// `;

// const Button = styled.button`
//   width: 100%;
//   padding: 10px;
//   background-color: #4caf50;
//   color: #fff;
//   border: none;
//   border-radius: 4px;
//   cursor: pointer;

//   &:hover {
//     background-color: #45a049;
//   }
// `;

// const LoginForm = () => {
//   const [email, setEmail] = useState('');
//   const [password, setPassword] = useState('');

//   const handleSubmit = (e) => {
//     e.preventDefault();
//     // Add your login logic here
//     console.log('Email:', email);
//     console.log('Password:', password);
//   };

//   return (
    
//     <div> 
      
//         <h1> Admin Loginpage !!</h1>
//     <FormContainer onSubmit={handleSubmit}>
//       <Label>
//         Email:
//         <Input type="email" value={email} onChange={(e) => setEmail(e.target.value)} />
//       </Label>
//       <Label>
//         Password:
//         <Input type="password" value={password} onChange={(e) => setPassword(e.target.value)} />
//       </Label>
//       <Button type="submit">Login</Button>
//     </FormContainer>
//     </div>
//   );
// };

// export default LoginForm;

