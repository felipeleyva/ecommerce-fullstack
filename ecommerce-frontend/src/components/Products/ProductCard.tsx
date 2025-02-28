interface ProductProps {
    id?: number;
    name: string;
    price: number;
    image: string;
}

function ProductCard({ name, price, image }: ProductProps) {
    return (
        <div className="bg-white p-4 shadow-md rounded-lg">
            <img src={image} alt={name} className="w-full h-40 object-cover rounded-md" />
            <h3 className="text-lg font-semibold mt-3">{name}</h3>
            <p className="text-blue-600 font-bold">${price}</p>
            <button className="mt-3 bg-blue-600 text-white px-4 py-2 rounded-md hover:bg-blue-700 transition">
                Añadir al carrito
            </button>
        </div>
    );
}

export default ProductCard;