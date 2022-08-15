import './App.css';
import Perro from './component/perro/Perro';
import data from './component/perro/lib/data';

function App() {
  return (
    <div className="App">
      <h1>Clientes caninos de Veterinaria</h1>
      {
        data.map((pet, index) => <Perro key= {index} {...pet}/>)
      }
    </div>
  );
}

export default App;
