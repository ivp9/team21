import { useState } from 'react'
import Card from './Card'

const CardsTable = ({ icons }) => {
	const [found, setFound] = useState([]);

	const [currnetTic, setCurrentTic] = useState([]);

	const checkTic = () => {
		if (currnetTic.length === 2 && currnetTic[0].name === currnetTic[1].name) {
			setFound(state => [...state, ...currnetTic]);
			setCurrentTic([]);
			return;
		}

		if (currnetTic.length === 2 && currnetTic[0].name !== currnetTic[1].name) {
			setCurrentTic([]);
			return;
		}
	}

	const handleTic = (name, id) => {
		if (found.some(card => card.name === name)) return;

		if (currnetTic.length <= 2) {
			setCurrentTic(state => {
				return state.length === 0 ? [{ name, id }] : [...state, { name, id }]
			})
		}
	};

	checkTic()

	return (
		icons.map((row) => {
			return row.map(({ icon, id, name }) => {
				const getColor = () => {
					let color = '';

					if (found.some(card => card.name === name)) {
						color = 'green';
					}

					if (currnetTic.length > 0 && currnetTic[currnetTic.length - 1].id === id) {
						color = 'blue'
					}

					return color;
				}

				return <Card
					key={id}
					onClick={handleTic}
					color={getColor()}
					name={name}
					icon={icon}
					id={id}
				/>
			})
		}
		)
	)
}

export default CardsTable;