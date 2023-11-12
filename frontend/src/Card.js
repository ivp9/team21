import styled from 'styled-components';

const Wrapper = styled.div`
  svg {
    width: 45px;
    height: 45px;
  }

  display: grid;
  place-items: center;
  background-color: ${({ color }) => color || '#f0f0f0'};
  width: 80px;
  height: 80px;
  padding: 16px;
  border-radius: 8px;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
`;

const Card = ({ icon, color, name, id, onClick }) => {
	return (
		<Wrapper onClick={() => onClick(name, id)} color={color}>
			{icon}
		</Wrapper>
	)
};

export default Card;