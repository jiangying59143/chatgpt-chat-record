package design.pattern.behavioral.chain_of_responsibility;

interface Request {
    int getAmount();
}

class PurchaseRequest implements Request {
    private int amount;
    private String purpose;

    public PurchaseRequest(int amount, String purpose) {
        this.amount = amount;
        this.purpose = purpose;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}

abstract class Approver {
    Approver successor;

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    public abstract void processRequest(Request request);
}

class Director extends Approver {
    @Override
    public void processRequest(Request request) {
        if (request.getAmount() < 10000) {
            System.out.println("Director approved request# " + request.getAmount());
        } else {
            successor.processRequest(request);
        }
    }
}

class VicePresident extends Approver {
    @Override
    public void processRequest(Request request) {
        if (request.getAmount() < 25000) {
            System.out.println("Vice President approved request# " + request.getAmount());
        } else {
            successor.processRequest(request);
        }
    }
}

class President extends Approver {
    @Override
    public void processRequest(Request request) {
        if (request.getAmount() < 100000) {
            System.out.println("President approved request# " + request.getAmount());
        } else {
            System.out.println("Request# " + request.getAmount() + " requires an executive meeting!");
        }
    }
}

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Approver director = new Director();
        Approver vicePresident = new VicePresident();
        Approver president = new President();

        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(president);

        Request request = new PurchaseRequest(20350, "General");
        director.processRequest(request);
        request = new PurchaseRequest(99999, "General");
        director.processRequest(request);
        request = new PurchaseRequest(100001, "General");
        director.processRequest(request);
    }
}
