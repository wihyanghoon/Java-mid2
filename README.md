### Java MID-LEVEL

* Generic
  * 범용적이라는 영어단어의 뜻, 범용적으로 사용하는 것을 말한다.
  * 객체를 생성한 시점에 타입을 정의 한다.
  * 함수의 매개변수와 유사하다. 함수의 매개변수의 경우에도 함수의 호출시점에 특정 값이 전달되는것과 같은 이치이다.
  ```java
  // T를 타입 매게변수 라고한다.
  class GenericBox <T> {
    T value;
    
    public void get(T value) {
        this.value = value;
    }
  }
  
  class Main {
    public static void main(String[] args){
      // <> 안에 전달되는 것을 타입인자 라고 한다.
      GenericBox<String> genericBox = new GenericBox<>();
    }
  }
  ```
  * 제네릭 명명
    * 대문자를 사용하며 용도에 맞는 단어의 첫글자를 사용하는 관례를 따른다.
    * E - Element
    * K - Key
    * N - Number
    * T - Type
    * V - Value
  * row type
    * <> 을 지정하지않는것을 로우 타입, 원시타입이라고 한다.
    * 로우 타입일 경우 Object로 사용된다고 이해하면 된다.
    * 제네릭은 나중에 등장한 문법이기 때문에 하위 호환이 필요하기 때문에 row type이 나오게 되었다.
    * 미사용 권장
  