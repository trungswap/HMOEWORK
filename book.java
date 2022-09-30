public class book {

        private String name;
        private author au;
        private double price;
        private int qty = 0;


        public book(String name, author au, double price, int qty)
        {
            this.name = name;
            this.au= au;
            this.price = price;
            qty = 0;
        }

        public String getName()
        {
            return name;
        }

        public author getAuthor()
        {
            return au;
        }

        public double getPrice()
        {
            return price;
        }

        public void setPrice(double p)
        {
            price = p;
        }

        public int getQty()
        {
            return qty;
        }

        public void setQty(int q)
        {
            qty = q;
        }

        public String toString() {
            String str = "Book: " + name + " " + au + " Price = " + price + " Qty = " + qty;
            return str;
        }

        public static void main(String[] args)
        {
            System.out.println("");
        }
    }

