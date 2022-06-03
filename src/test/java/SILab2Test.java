import static org.junit.jupiter.api.Assertions.*;

@Test
void EveryBranchTest(){
    List<String> statement1 = List.of();
    List<String> statement2 = List.of("0", "#");
    List<String> statement3 = List.of("0", "#", "0", "#", "0", "#", "0", "#", "0");
    List<String> statement3Output = List.of("2", "#", "2", "#", "4", "#", "2", "#", "2");

    IllegalArgumentException illegalGreater, illegalPerfect;

    //illegal Greather
    illegalGreater = assertThrows(IllegalArgumentException.class, () -> SILab2.function(statement1));
    assertTrue(illegalGreater.getMessage().contains("List lenght should be greater than 0"));

    //illegal Perfect
    illegalPerfect = assertThrows(IllegalArgumentException.class, () -> SILab2.function(statement2));
    assertTrue(illegalGreater.getMessage().contains("List lenght should be a perfect square"));

    assertEquals(SILab2.function(statement3),statement3Output);
}
