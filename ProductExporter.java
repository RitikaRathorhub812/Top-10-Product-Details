import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductExporter {

    private static final String CSV_HEADER = "Product Name,Product Price,Item Number,Model Number,Product Category,Product Description";

    public static void main(String[] args) {
        List<Product> products = getTop10Products(); // assume this method returns the top 10 products

        String csvFilePath = "Test data\sample1.csv"; // change this to your desired file path
        try (FileWriter csvWriter = new FileWriter(csvFilePath)) {
            csvWriter.append(CSV_HEADER);
            csvWriter.append("\n");

            for (Product product : products) {
                csvWriter.append(product.getName());
                csvWriter.append(",");
                csvWriter.append(String.valueOf(product.getCategory()));
                csvWriter.append(",");
                csvWriter.append(String.valueOf(product.getPrice()));
                csvWriter.append(",");
                csvWriter.append(String.valueOf(product.getItem()));
                csvWriter.append(",");
                csvWriter.append(product.getPrdctCategory());
                csvWriter.append(",");
                csvWriter.append(product.getPrdctDescription());
                csvWriter.append("\n");
            }

            System.out.println("Successfully exported " + products.size() + " products to " + csvFilePath);
        } catch (IOException e) {
            System.out.println("Failed to export products to " + csvFilePath + ": " + e.getMessage());
        }
    }

    private static List<Product> getTop10Products() {
        // assume this method returns a list of the top 10 products based on some criteria
        //products.add(new Product("Air Conditioners", 219.99, 24056089, "123445","Air Conditioners","sdfgmmgh"));
        List<Product> products = new ArrayList<>();
        products.add(new Product("12-Piece Garage Cabinet Corner Set", 123.99, 50264,21192,"Accent & Coffee Tables","Radinka side table features white printed tempered glass tabletop and base that complements the design of the table."));
        products.add(new Product("Pendaflex 21 Pockets Expanding File w/2 Expansion", 22.99, 901374, 01365,"Accordion Folders","Pendaflex all purpose expanding file is made of leather like, moisture-resistant coated red fiber and is made of Tyvek gusset material"));
        products.add(new Product("TOPS Receipts", 18.49, 622415,46808,"Accounting & Record Journals","Keep accurate accounting records and provide clients with payment documentation by using this TOPS carbonless 3-part receipt book."));
        products.add(new Product("Crayola Colors of Kindness Washable Markers", 4.99, 24548918,58-7807,"Art & School Markers","Spread the love with a pack of Crayola Colors of Kindness markers. These fine-line markers are packaged in an adorable box. They are safe and nontoxic art supplies that unlock creativity in kids, whether they're working on art projects, school projects, or holiday decorations. These classic fine-line markers are durable, long-lasting, and perfect for creating thin lines for detailed works of art. Practice hand lettering to underline key information as you are studying. You can also pair them with a coloring book or construction paper for the perfect bundled gift idea, or add them to your holiday gift list as stocking stuffers or Easter basket stuffers. These colored markers are essential for large-group coloring activities outside of school, too."));
        products.add(new Product("Moleskine 8.25 x 11.75 Sketch Book", 36.95, 2639126,931939,"Sketch Pads & Books","Carry extra loose papers and notes in this Moleskine Art Collection black sketchbook."));
        products.add(new Product("Disney Learning", 14.39, 24445069,705369,"Education","The Disney Learning Magical Adventures in Preschool workbook offers fun activities illustrated with kids' favorite Disney characters to keep young learners engaged as they practice important school skills. This 256-page workbook includes 140 stickers to motivate students as they build math and reading readiness."));
        products.add(new Product("Staples Stickies Tabletop Easel Pad", 21.49, 958102,23448,"Easel Pads","Staples Stickies repositionable tabletop easel pad features adhesive backing on each sheet for displaying ideas on walls or whiteboards."));
        products.add(new Product("Stanley® Classic 199® Fixed Blade Utility Knives", 11.79, 595547,680-10-209,"Hand & Power Tools","Stanley® Classic 199® Fixed Blade Utility knife works with all Stanley® replacement utility blades."));
        products.add(new Product("4 pack Medium Gift Bag - Mauve Buckle Bow Gift Bags Perfect for Weddings", 13.69, 24194415,000000523,"Retail Store Supplies","4 Pack Medium Gift Bag Buckle Bow"));
        products.add(new Product("Cricut EasyPress™ 2", 149.00, 24446614,2005433,"Arts & Crafts","Be unstoppable with your everyday iron-on essential, the Cricut EasyPress 2 – a sweet combination of a heat-press and an iron"));

        products.sort(Comparator.comparing(Product::getPrice).reversed());
        return products.subList(0, 10);
    }
}

class Product {
    private String Product_Name;
    private double Product_Price ;
    private double Item_Number;
    private double Model_Number;
    private String Product_Category;
    private String Product_Description;

    public Product(String Product_Name,double Product_Price,double Item_Number, double Model_Number,String Product_Category,String Product_Description) {
        this.Product_Name = Product_Name;
        this.Product_Price = Product_Price;
        this.Item_Number = Item_Number;
        this.Model_Number = Model_Number;
        this.Product_Category = Product_Category;
        this.Product_Description = Product_Description;

    }

    public String getName() {
        return Product_Name;
    }

    public double getCategory() {
        return Product_Price;
    }

    public double getPrice() {
        return Item_Number;
    }
    public double getItem() {
        return Model_Number;
    }
    public String getPrdctCategory() {
        return Product_Category;
    }
    public String getPrdctDescription() {
        return Product_Description;
    }
}
