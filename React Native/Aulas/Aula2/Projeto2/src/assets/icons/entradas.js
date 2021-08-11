import * as React from "react"
import Svg, { Path } from "react-native-svg"

function SvgComponent(props) {
  return (
    <Svg
      width={props.width}
      height={props.height}
      viewBox="0 0 40 40"
      fill="none"
      xmlns="http://www.w3.org/2000/svg"
      {...props}
    >
      <Path
        d="M20 3.333C10.795 3.333 3.333 10.795 3.333 20c0 9.205 7.462 16.667 16.667 16.667 9.205 0 16.666-7.462 16.666-16.667 0-9.205-7.461-16.667-16.666-16.667z"
        stroke="#12A454"
        strokeWidth={2}
        strokeLinecap="round"
        strokeLinejoin="round"
      />
      <Path
        d="M26.666 20L20 13.333 13.333 20M20 26.667V13.333"
        stroke="#12A454"
        strokeWidth={2}
        strokeLinecap="round"
        strokeLinejoin="round"
      />
    </Svg>
  )
}

export default SvgComponent
