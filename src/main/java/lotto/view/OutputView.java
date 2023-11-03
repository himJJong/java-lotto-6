package lotto.view;

import lotto.model.Lotto;

import java.util.List;

public class OutputView {
    private final String INPUT_MONEY = "구입금액을 입력해 주세요.";
    private final String COUNT_LOTTO = "개를 구매했습니다.";
    private final String INPUT_LOTTO_NUMBERS = "당첨 번호를 입력해 주세요.";
    private final String INPUT_BONUS_NUMBER = "보너스 번호를 입력해 주세요.";
    private final String TOTAL = "당첨 통계\n" + "---";

    public void inputMoney(){
        System.out.println(INPUT_MONEY);
    }

    public void count(int lotto){
        System.out.println("\n" + lotto + COUNT_LOTTO);
    }

    public void printTotalLotto(List<Lotto> totalLotto) {
        for(int lotto = 0; lotto < totalLotto.size(); lotto++) {
            System.out.println(totalLotto.get(lotto).toString());
        }
    }
}
