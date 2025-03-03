import ProductCard from "./ProductCard";

// Simulación de productos
const products = [
    { id: 1, name: "Camiseta", price: 19.99, image: "/shirt.jpg" },
    { id: 2, name: "Zapatos", price: 49.99, image: "/shoes.jpg" },
    { id: 3, name: "Gorra", price: 14.99, image: "/hat.jpg" }
  ];

function ProductList() {
    return (
        <section className="container mx-auto px-6 py-4">
            <h2 className="text-3xl font-bold !text-gray-500 text-center">Productos Destacados</h2>
            <div className="grid grid-cols-1 md:grid-cols-3 gap-6 mt-6">
                {products.map((product) => (
                <ProductCard key={product.id} {...product} />
                ))}
            </div>
        </section>
    );
}

export default ProductList;