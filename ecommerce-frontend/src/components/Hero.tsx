import { Link } from "react-router-dom";

function Hero() {
    return (
      <section className="bg-blue-600 text-white py-14 text-center">
        <div className="container mx-auto px-6">
            <h1 className="text-4xl font-bold">Bienvenido a Nuestra Tienda</h1>
            <p className="mt-3 text-lg">Los mejores productos a precios increíbles.</p>
            <Link
                to="/products"
                className="mt-5 inline-block bg-white text-blue-600 px-6 py-2 rounded-md shadow-md hover:bg-gray-100 transition"> 
                Explorar Productos
            </Link>
        </div>
      </section>
    );
  }
  
  export default Hero;