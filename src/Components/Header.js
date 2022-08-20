import React from 'react'
import Navigation from './Navigation'

function Header() {
  return (
    <header className="border-b-8 p-3 flex justify-between items-center">
        <span className="font-bold">
        GoGoYugioh
        </span>

        <Navigation />
    </header>
  )
}

export default Header