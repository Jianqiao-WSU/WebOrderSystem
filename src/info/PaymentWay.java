package info;

public enum PaymentWay {
	NET_BANK{
		@Override
		public String getName() {
			return "网上银行支付";
		}
	},
	ALIPAY{
		@Override
		public String getName() {
			return "支付宝";
		}
	},
	FINISH_PAY{
		@Override
		public String getName() {
			return "货到付款";
		}
	};
	public abstract String getName();
}