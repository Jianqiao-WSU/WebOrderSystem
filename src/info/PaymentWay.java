package info;

public enum PaymentWay {
	NET_BANK{
		@Override
		public String getName() {
			return "��������֧��";
		}
	},
	ALIPAY{
		@Override
		public String getName() {
			return "֧����";
		}
	},
	FINISH_PAY{
		@Override
		public String getName() {
			return "��������";
		}
	};
	public abstract String getName();
}