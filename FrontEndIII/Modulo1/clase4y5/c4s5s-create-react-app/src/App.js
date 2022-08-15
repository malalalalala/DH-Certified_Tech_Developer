import './App.css';
import Padre from './components/clase4A/Padre'
import SinFragment from './components/clase5A/SinFragment';
import Fragment from './components/clase5A/Fragment';
import Children from './components/clase5A/Children';
import Father from './components/clase5A/Father';
import Bob from './components/clase5A/Bob';

function App() {
  return (
    <>
    <Padre/>
    <SinFragment/>
    <Fragment/>
    <Father>
      <Children autor='Soy un hijo'/>
    </Father>
    <Bob/>
    </>
  )
}

export default App;
