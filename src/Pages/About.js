import React from 'react'

function About() {
  return (
    <div>
      <p className="font-bold text-2xl mb-3">
      About me
      </p>
      <p className="mb-3">
        This is the about me page.
      </p>
      <p className="mb-3">
     GogoYugioh is a web application that lets the user search through an index of all the known Yugioh cards and display the prices for the card if it is in near mint condition.
     Yugioh is a card game in which two players attempt to defeat each other by decreasing their opponent's Life Points (down to 0) using a collection of monsters, spells, and trap cards.
     The application will be using an API by YGOPRODeck to gather the necessary information for the user. The web application will be able to sort the card by selecting a user's choice of category and search for a specific card.
     The project will be using Java, React.JS, MySQL, and Spring Boot.
      </p>
      </div>
  )
}

export default About