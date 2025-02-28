import Hero from "../components/Hero";
import ProductList from "../components/Products/ProductList";

function Home() {
  return (
    <div className="grid gap-8">
        <Hero />
        <ProductList />
    </div>
  );
}

export default Home;
