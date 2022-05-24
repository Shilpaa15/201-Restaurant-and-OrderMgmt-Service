package com.ordermyfood.Controller.ModelRequest;

public class OrderCancelResponse {
	
		 private String transactionId;
		    private String status;
		    
			public OrderCancelResponse() {
				super();
				// TODO Auto-generated constructor stub
			}
			
			public OrderCancelResponse(String transactionId, String status) {
				super();
				this.transactionId = transactionId;
				this.status = status;
			}
			@Override
			public String toString() {
				return "OrderCancelResponse [transactionId=" + transactionId + ", status=" + status + "]";
			}

			public String getTransactionId() {
				return transactionId;
			}
			public void setTransactionId(String transactionId) {
				this.transactionId = transactionId;
			}
			public String getStatus() {
				return status;
			}
			public void setStatus(String status) {
				this.status = status;
			}	
	}


