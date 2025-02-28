import { Link } from "react-router-dom";

function Navbar() {
  return (
    <nav className="bg-gray-900 shadow-md">
      <div className="container mx-auto flex justify-between items-center px-6 py-4">
        <Link to="/" className="text-lg font-semibold text-white hover:text-gray-300">
          Mi E-commerce
        </Link>
        <ul className="flex space-x-8">
          <li>
            <Link to="/products" className="text-gray-300 hover:text-white transition">
              Productos
            </Link>
          </li>
          <li>
            <Link to="/cart" className="text-gray-300 hover:text-white transition">
              🛒 Carrito
            </Link>
          </li>
        </ul>
      </div>
    </nav>
  );
}

export default Navbar;
