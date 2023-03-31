package com.example.hw1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
public class ExtensionController {
    @GetMapping("/extension")
    public String boo() {
        Map<Integer, String> catchPhrases = new HashMap<>();
        catchPhrases.put(1, "Життя — це те, що з тобою відбувається, поки ти будуєш плани. Джон Леннон");
        catchPhrases.put(2, "Прагніть не до успіху, а до цінностей, які він дає. Альберт Айнштайн");
        catchPhrases.put(3, "Спочатку мрії здаються неможливими, потім неправдоподібними, а потім неминучими. Крістофер Рів");
        catchPhrases.put(4, "Найкраща помста — величезний успіх. Френк Сінатра");
        catchPhrases.put(5, "Талант — це дар, якому неможливо ні навчити, ні навчитися. Іммануїл Кант");
        catchPhrases.put(6, "Єдиний спосіб робити свою роботу добре — це любити її. Якщо ти ще не знайшов свою улюблену справу, продовжуй шукати. Стів Джобс");
        catchPhrases.put(7, "Поки ти тримаєшся за свою «стабільність», хтось поруч втілює в життя твої мрії. Роберт Орбен");
        catchPhrases.put(8, "Успіх — це вміння рухатись від невдачі до невдачі, не втрачаючи ентузіазму. Вінстон Черчилль");
        catchPhrases.put(9, "Успіх — справа виключно випадку. Це вам скаже будь-який невдаха. Ерл Вілсон");
        catchPhrases.put(10, "Не варто хвилюватися. У світі немає нічого страшнішого за нас самих. Туве Янссон");
        Random rn = new Random();

        int key = rn.nextInt(1,10);
        String rnPhrase = catchPhrases.get(key);

        return rnPhrase;
    }
}
