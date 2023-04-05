import React from 'react'

const SegundoComponente = ({extra, info}) => {
  return (
    <div>
      <h1>SegundoComponente</h1>
        <li>{extra}</li>
        <li>{info.lugar}</li>
        <li>{info.gusto}</li>
    </div>
  )
}

export default SegundoComponente

