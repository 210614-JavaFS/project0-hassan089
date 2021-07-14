package com.revature.models;

public class Customer {
	
	private String customer_number;
	private String knownas;
	private String transaction;
	private String first;
	private String last;
	private String tot_funds;


	public Customer(String knownas, String transaction, String first, String last,
			String tot_funds) {
		super();
		this.knownas = knownas;
		this.transaction = transaction;
		this.first = first;
		this.last = last;
		this.tot_funds = tot_funds;
	
	}
	public Customer() {
		super();
	}
	public Customer(String customer_number, String knownas, String transaction, String first, String last,
			String tot_funds) {
		super();
		this.customer_number = customer_number;
		this.knownas = knownas;
		this.transaction = transaction;
		this.first = first;
		this.last = last;
		this.tot_funds = tot_funds;
	}
	public String getCustomer_number() {
		return customer_number;
	}
	public void setCustomer_number(String customer_number) {
		this.customer_number = customer_number;
	}
	public String getKnownas() {
		return knownas;
	}
	public void setKnownas(String knownas) {
		this.knownas = knownas;
	}
	public String getTransaction() {
		return transaction;
	}
	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public String getTot_funds() {
		return tot_funds;
	}
	public void setTot_funds(String tot_funds) {
		this.tot_funds = tot_funds;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customer_number == null) ? 0 : customer_number.hashCode());
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((knownas == null) ? 0 : knownas.hashCode());
		result = prime * result + ((last == null) ? 0 : last.hashCode());
		result = prime * result + ((tot_funds == null) ? 0 : tot_funds.hashCode());
		result = prime * result + ((transaction == null) ? 0 : transaction.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (customer_number == null) {
			if (other.customer_number != null)
				return false;
		} else if (!customer_number.equals(other.customer_number))
			return false;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (knownas == null) {
			if (other.knownas != null)
				return false;
		} else if (!knownas.equals(other.knownas))
			return false;
		if (last == null) {
			if (other.last != null)
				return false;
		} else if (!last.equals(other.last))
			return false;
		if (tot_funds == null) {
			if (other.tot_funds != null)
				return false;
		} else if (!tot_funds.equals(other.tot_funds))
			return false;
		if (transaction == null) {
			if (other.transaction != null)
				return false;
		} else if (!transaction.equals(other.transaction))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Customer [customer_number=" + customer_number + ", knownas=" + knownas + ", transaction=" + transaction
				+ ", first=" + first + ", last=" + last + ", tot_funds=" + tot_funds + "]";
	}
	
	
	
}



	
	
	
