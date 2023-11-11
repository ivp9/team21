import 'bootstrap/dist/css/bootstrap.min.css';
import { icons } from './icons';
import styled from 'styled-components';
import { prepareCards } from './utils/prepareCards';
import CardsTable from './CardsTable'

const Container = styled.div`
  display: grid;
  place-items: center;
  height: 100vh; 
  background-color: gray;
`;

const CardContainer = styled.div`
  display: grid;
  grid-template-rows: repeat(4, 1fr);
  grid-template-columns: repeat(4, 1fr);
  gap: 8px;
`;

function App() {
  const preparedIcons = prepareCards(icons);

  return (
    <Container>
      <CardContainer>
        <CardsTable icons={preparedIcons} />
      </CardContainer>
    </Container>
  );
}

export default App;
