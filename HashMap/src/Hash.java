import java.util.HashMap;
import java.util.Map.Entry;

public class Hash {

  public static void main(String[] args) throws Exception {
    // HashMap선언
    HashMap<String, String> map1 = new HashMap<String, String>(); //HashMap 생성
    HashMap<String, Integer> map2 = new HashMap<>();
    HashMap<String, String> map3 = new HashMap<>(map1); //
    HashMap<String, String> map4 = new HashMap<>(10); //초기 용량 지정(HashMap은 값이 추가로 들어오면 list처럼 공간을 늘리는데 이 떄 두 배씩 늘림. 과부하를 막기 위해 초기용량을 알면 미리 지정)
    HashMap<String, String> map5 = new HashMap<>(10, 0.7f); //초기 capacity, load factor 지정
    HashMap<Integer, String> map6 = new HashMap<Integer, String>() {

      {
        put(0, "value"); //초기값 지정
        put(1, "value2");
        put(2, "value3");
      }
    };

    // HashMap 값 추가
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "초코");
    map.put(2, "바나나");
    map.put(3, "딸기");
    map.put(1, "사과"); //기존 key값이 존재하므로 "초코"가 사과"로 대치됨
    System.out.println(map);

    map.remove(1); //key값 1제거
    map.clear(); //모든 값 제거
    System.out.println(map);

    System.out.println(map6); //전체 출력
    System.out.println(map6.get(1)); //key값 "1"의 value얻기

    //entrySet() 활용
    for (Entry<Integer, String> entry : map6.entrySet()) {
      System.out.println(
        "[key]: " + entry.getKey() + " [Value]: " + entry.getValue()
      );
    }
    System.out.println();
    //keySet() 활용
    for (Integer i : map6.keySet()) { //저장된 key값 확인
      System.out.println("[Key]: " + i + " [Value]: " + map6.get(i));
    }
  }
}
