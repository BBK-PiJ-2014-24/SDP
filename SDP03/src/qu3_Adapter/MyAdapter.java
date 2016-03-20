package qu3_Adapter;

public class MyAdapter implements PayD{
	
	private Xpay xpay;
	
	public MyAdapter(Xpay xpay){
		this.xpay = xpay;
	}
	

	@Override
	public String getCustCardNo() {
		return xpay.getCreditCardNo();
	}

	@Override
	public void setCustCardNo(String custCardNo) {
		xpay.setCreditCardNo(custCardNo);	
	}

	@Override
	public String getCardOwnerName() {
		return xpay.getCustomerName();
	}

	@Override
	public void setCardOwnerName(String cardOwnerName) {
			xpay.setCustomerName(cardOwnerName);	
	}

	@Override
	public String getCardExpMonthDate() {
		return xpay.getCardExpMonth();
	}

	@Override
	public void setCardExpMonthDate(String cardExpMonthDate) {
		xpay.setCardExpMonth(cardExpMonthDate);
	}

	@Override
	public Integer getCVVNo() {
		return xpay.getCardCVVNo().intValue();
	}

	@Override
	public void setCVVNo(Integer cVVNo) {
		String s = Integer.toString(cVVNo);
		Short sh = new Short(s); 
		xpay.setCardCVVNo(sh);
	}

	@Override
	public Double getTotalAmount() {
		return xpay.getAmount();
	}

	@Override
	public void setTotalAmount(Double totalAmount) {
		xpay.setAmount(totalAmount);
		
	}
	

}
