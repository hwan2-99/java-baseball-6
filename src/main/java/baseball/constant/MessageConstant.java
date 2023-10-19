package baseball.constant;

public class MessageConstant {
    public static final String GAME_START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    public static final String INPUT_MESSAGE = "숫자를 입력해주세요 :";
    public static final String NOTHING = "낫싱";
    public static final String STRIKE = "스트라이크";
    public static final String BALL = "볼";
    public static final String RESTART_OR_END_MESSAGE =
            "게임을 새로 시작하려면 " + NumberConstant.RESTART_NUMBER + ", 종료하려면 " + NumberConstant.GAME_END_NUMBER + "를 입력하세요.";
    public static final String WINNER_MESSAGE = NumberConstant.GAME_WIN_NUMBER + "개의 숫자를 모두 맞히셨습니다! 게임 종료";
    public static final String VALIDATE_SIZE_MESSAGE = "크기가 "+NumberConstant.INPUT_SIZE + "이 아닙니다.";

}
