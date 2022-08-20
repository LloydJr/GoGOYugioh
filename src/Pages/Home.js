import React from 'react'
import HelloWorld from '../Components/HelloWorld'


function Home() {
  return (
    <div >
      <p className="font-bold text-2xl mb-3">
      Home Page
      </p>
      <p className='mb-3'>
        This is the home page.
        I will need to add a table here to display yugioh cards.
      </p>
      <HelloWorld name="Lloyd"/>
      </div>
      
  )
}

export default Home