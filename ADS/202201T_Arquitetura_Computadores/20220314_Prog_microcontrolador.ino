//Inclusão de biblioteca externa para configuração do LDC 16x2
#include <LiquidCrystal.h>
//Declaração de variáveis com suas inicializações. Definirão os pinos de controle
const int rs = 12, en = 11, d4 = 5, d5 = 4, d6 = 3, d7 = 2;
//Inicialização dos pinos via biblioteca LiquidCrystal.h
LiquidCrystal lcd(rs, en, d4, d5, d6, d7);
//Método de setup sobre o hardware externo e inicialização
void setup() {
  //Método que fará a inicialização do LDC de 16 caracteres e 2 colunas
  lcd.begin(16, 2);
}
//Método que fará o loop das instruções abaixo
void loop() {
  //Método de exibição de cadeia de strings via método
  lcd.print("Obrigado pela");
  //Método que posicionará o cursor para a próxima linha
  lcd.setCursor(0, 1);
  //Método de exibição de cadeia de strings via método
  lcd.print("dedicacao");
  //Método que posicionará o cursor para a linha anterior
  lcd.setCursor(0, 0);
}
