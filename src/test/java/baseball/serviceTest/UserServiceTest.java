package baseball.serviceTest;

import baseball.service.UserService;
import baseball.validation.NumberValidation;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;

public class UserServiceTest {

    UserService userService;
    NumberValidation numberValidation;

    @BeforeEach
    void setUp() {
        userService = new UserService();
        numberValidation = new NumberValidation();

        userService = Mockito.mock(UserService.class);
        Mockito.when(userService.inputUserNumber()).thenReturn("321");
    }

    @Test
    void 사용자_입력_테스트() {
        List<Integer> test = new ArrayList<>();
        test.add(3);
        test.add(2);
        test.add(1);

        List<Integer> user = numberValidation.validateInputNumber(userService.inputUserNumber());

        for (int i = 0; i < test.size(); i++) {
            assertThat(test.get(i)).isEqualTo(user.get(i));
        }

    }

}
