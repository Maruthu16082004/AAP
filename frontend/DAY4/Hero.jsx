/* import name from "../assets/images/name.png";
 */ import link2 from "../assets/images/link5.jpg";
function Hero() {
  return (
    <div className="hero-container">
      <div className="hero">
        <div className="col1">
          <h1>Make</h1>
          <h2>your choice !!</h2>
        </div>
        <div className="col2 ">
          <img className="img" src={link2}></img>
          {/* <div className="ball"> </div>{" "} */}
        </div>
      </div>
    </div>
  );
}

export default Hero;
