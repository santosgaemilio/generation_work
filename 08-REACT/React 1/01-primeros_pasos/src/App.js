import logo from './logo.svg';
import './App.css';
// Este import se hizo automático cuando hice el import del PrimerComponente
import PrimerComponente from './misComponentes/PrimerComponente';
import SegundoComponente from './misComponentes/SegundoComponente';
// Cuando haces el export junto con la función flecha tienes que importar así
import { TercerComponente } from './misComponentes/TercerComponente';
import CuartoComponente from './misComponentes/CuartoComponente';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Contacto from './pages/Contacto';

function App() {
  const datos = {
    lugar: "Cln",
    gusto: "Perros Labrador"
  }
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        {/* **************************************** */}

        <BrowserRouter>
          <Routes>
            <Route path = "/" element = {<div>Hola CH23</div>}/>
            <Route path = "/msj" element = {<div>GENERATION</div>}/>
            <Route path = "/contacto" element = {<Contacto/>}/>
          </Routes>
        </BrowserRouter>

        {/* **************************************** */}
        <p>
          Hola mundo
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
        <h1>Cohorte 23</h1>
        <div class = "componente">
            <hr/>
            <CuartoComponente/>
            <hr/>
            <PrimerComponente/>
            <hr/>
            <SegundoComponente extra = "Esto es extra"
            info = {datos}/>
            <hr/>
            <TercerComponente nombre = "Segu" apellido = "Peps"/>
        </div>
      </header>
    </div>
  );
}

export default App;
