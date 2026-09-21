import java.util.LinkedList;

public class PurchaseLog {

    private LinkedList<PurchaseItem> items = new LinkedList<>();
    // TODO: declare the field that stores your PurchaseItem records.
    // Decide: ArrayList<PurchaseItem> or LinkedList<PurchaseItem>?

    public void addItem(PurchaseItem item) {
        // TODO
        items.addLast(item);
    }

    public PurchaseItem findItemByName(String name) {
        // TODO
        for (PurchaseItem item : items){
            if (item.getName() != null){
                return item; 
            }
        }
        return null;
    }

    public void updatePrice(String name, double newPrice) {
        // TODO
        PurchaseItem item = findItemByName(name);
        if (item != null){
            item.setPrice(newPrice);
        }
    }

    public void printDailyReport() {
        // TODO: loop through every item - total count, total revenue, best seller

        int totalCount = 0;
        double totalRev = 0.0;
        String bestSeller = null;
        int bestQuant = 0;

        for (PurchaseItem item : items) {
            totalCount++;
            totalRev = item.getPrice();
            bestSeller = item.getName();
            
        }

        System.out.println("Items sold: " + totalCount);
        System.out.println("Total revenue: " + totalRev);
        System.out.println("Best seller: " + bestSeller + "Amount sold: "+ bestQuant);
    }

    public int itemCount() {
        // TODO
        return items.size();
    }
}
