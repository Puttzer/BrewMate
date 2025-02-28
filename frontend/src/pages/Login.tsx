import TextField from '@mui/material/TextField';
import Box from '@mui/material/Box';
import Button from '@mui/material/Button';
import { useState } from 'react';
import { Link } from 'react-router';
import Typography from '@mui/material/Typography';

const Login = () => {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');

  return (
    <Box
      component='form'
      onSubmit={e => e.preventDefault()}
      className='flex flex-col w-full max-w-sm mx-auto mt-8 p-4 shadow-md rounded space-y-4'
    >
      <TextField
        type='email'
        label='Email'
        variant='outlined'
        required
        onChange={e => setEmail(e.target.value)}
        className='mb-4'
      />
      <TextField
        type='password'
        label='Password'
        variant='outlined'
        required
        onChange={e => setPassword(e.target.value)}
      />
      <Button type='submit' variant='contained' disabled={!email || !password}>
        Submit
      </Button>
      <Typography>No account? Register here</Typography>
      <Link to='/auth/register'>
        <Button type='submit' variant='contained'>
          Register
        </Button>
      </Link>
    </Box>
  );
};

export default Login;
