package com.practise.design.pattern.behavioral.templatemethod;
/**
 * defines the skeleton of the algorithm and
 * lets subclasses redefine the substeps without
 * altering the sequence
 * @author seshshan
 *
 */
public abstract class OrderTemplate {
    public boolean isGift;

	
	public final void processOrder(){
		doCheckout();
		doPayment();
		if (isGift) {
            wrapGift();
        } else {
            doReceipt();
        }
        doDelivery();
	}
    
	public abstract void doCheckout();

    public abstract void doPayment();

    public abstract void doReceipt();

    public abstract void doDelivery();

    public final void wrapGift() {
        System.out.println("Gift wrapped.");
    }
}
