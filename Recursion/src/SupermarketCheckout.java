import java.util.*;

public class SupermarketCheckout {
    public class Customer {
        long customerId;
        long lineNumber;
        long numItems;
        public Customer(long customerId, long lineNumber, long numItems){
            this.customerId = customerId;
            this.lineNumber = lineNumber;
            this.numItems = numItems;
        }
    }

    private Map<Long, List<Long>> lineInfo = new HashMap<>();
    private Map<Long, Customer> customers = new HashMap<>();


    public SupermarketCheckout(){}

    public void onCustomerEnter(long customerId, long lineNumber, long numItems) {
        Customer customer = new Customer(customerId, lineNumber, numItems);
        customers.put(customerId, customer);
        if(lineInfo.containsKey(lineNumber)){
            lineInfo.get(lineNumber).add(customerId);

        }else{
            List<Long> newLine = new ArrayList<>();
            newLine.add(customerId);
            lineInfo.put(lineNumber, newLine);
        }
    }

    public void onBasketChange(long customerId, long newNumItems) {
        if(customers.containsKey(customerId)){
            Customer c = customers.get(customerId);
            c.numItems = newNumItems;
        }
    }

    public void onLineService(long lineNumber, long numProcessedItems) {
        List<Long> customerLine = lineInfo.get(lineNumber);
        if(customerLine != null){
            Iterator<Long> iterator = customerLine.iterator();
            while (iterator.hasNext()){
                long customerId = iterator.next();
                Customer info = customers.get(customerId);
                long nums = info.numItems;
                if(numProcessedItems < nums){
                    nums -= numProcessedItems;
                }else{
                    numProcessedItems -= nums;
                    customers.remove(customerId);
                    onCustomerExit(customerId);
                    iterator.remove();
                }
            }
        }
    }

    public void onLinesService() {
        for(long line : lineInfo.keySet()){
            onLineService(line, 1);
        }
    }

    private void onCustomerExit(long customerId) {
        // Don't change this implementation.
        System.out.println(customerId);
    }
};

//public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        long N = scanner.nextLong();
//        scanner.nextLine();
//
//        SupermarketCheckout checkoutTracker = new SupermarketCheckout();
//        for (long i = 0; i < N; ++i) {
//        String[] instruction = scanner.nextLine().split(" ");
//        String instructionType = instruction[0];
//
//        if (instructionType.equals("CustomerEnter")) {
//        long customerId = Long.parseLong(instruction[1]);
//        long lineNumber = Long.parseLong(instruction[2]);
//        long numItems = Long.parseLong(instruction[3]);
//        checkoutTracker.onCustomerEnter(customerId, lineNumber, numItems);
//        } else if (instructionType.equals("BasketChange")) {
//        long customerId = Long.parseLong(instruction[1]);
//        long newNumItems = Long.parseLong(instruction[2]);
//        checkoutTracker.onBasketChange(customerId, newNumItems);
//        } else if (instructionType.equals("LineService")) {
//        long lineNumber = Long.parseLong(instruction[1]);
//        long numProcessedItems = Long.parseLong(instruction[2]);
//        checkoutTracker.onLineService(lineNumber, numProcessedItems);
//        } else if (instructionType.equals("LinesService")) {
//        checkoutTracker.onLinesService();
//        } else {
//        System.out.println("Malformed input!");
//        System.exit(-1);
//        }
//        }
//        }

