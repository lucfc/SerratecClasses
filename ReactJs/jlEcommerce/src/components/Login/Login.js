import "./style.css";
import Header from "../Header/Header";
import NavBar from "../NavBar/NavBar";
import Footer from "../Footer/Footer";
import LogoFooter from "../../Assets/logo-footer.png";
import FuncionarioService from "../Funcionario/FuncionarioService";
import React, { useState, useEffect} from 'react';
import styled from 'styled-components';
import { Link } from 'react-router-dom';


var emptyFuncionario = {
  nome: '',
  cpf: '',
};


const Login = () => {
  
  const [funcionario, setFuncionario] = useState(emptyFuncionario);
  
  const funcionarioService = new FuncionarioService();
  
  useEffect(() => {
    funcionarioService.getFuncionario().then(data => setFuncionario(data));
  }, []);
  console.log(funcionario);

  const authToken = () =>{
    console.log("Entrou authToken");
    console.log(emptyFuncionario.nome);
    console.log(emptyFuncionario.cpf);
    funcionario.map((func) => {
      if(emptyFuncionario.nome === func.nome){
        if(emptyFuncionario.cpf === func.cpf){
          return localStorage.setItem('TOKEN',emptyFuncionario.cpf);
        }else{
          return <h1>Usuário/Senha incorreto.</h1>
        }
      }else{
        return <h1>Usuário/Senha incorreto.</h1>
      }
    },[]);
  };

  
  const botaoLogin = ({className, children}) => (
    <Link className={className} to='/Portal' onClick={authToken}>
      {children}
    </Link>
  )
  const Button = styled(botaoLogin)`
background-color: #4CAF50;
  border: none;
  color: white;
  padding: 1vw 2vw;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  border-radius: 1vw;
`;
  
  const onInputChangeCPF = (e, nome) => {
    const val = (e.target && e.target.value) || '';
    emptyFuncionario.cpf = val;
    console.log(emptyFuncionario);
  }

  const onInputChangeNome = (e, nome) => {
    const val = (e.target && e.target.value) || '';
    emptyFuncionario.nome = val;
    console.log(emptyFuncionario);
  }

  return (
    <>
      <Header />
      <NavBar />
      <div className="content">
        <div className="modal-content">
          <div className="modal-header">
            <img src={LogoFooter} alt="Imagem logo justice league" />
            <h2>Tela de login</h2>
          </div>

            <input className="input-user" type="text" placeholder="Nome" onChange={(e) => onInputChangeNome(e, 'nome')}/>
            <input className="input-user" type="text" placeholder="Cpf" onChange={(e) => onInputChangeCPF(e, 'cpf')}/>
            <Button>Logar</Button> 

        </div>
      </div>
      <Footer />
    </>
  );
};

export default Login;
