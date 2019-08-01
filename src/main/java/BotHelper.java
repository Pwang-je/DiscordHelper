import com.google.common.util.concurrent.FutureCallback;

import de.btobastian.javacord.DiscordAPI;
import de.btobastian.javacord.Javacord;
import de.btobastian.javacord.entities.message.Message;
import de.btobastian.javacord.listener.message.MessageCreateListener;

public class BotHelper {

  // FFXIV Ggang Chong! Duty Macro.

  static public void main(String args[]) {
    final DiscordAPI api = Javacord.getApi("NjA2NDYwMjUwOTk1OTQ5NTY4.XULY0g.qYNzUWZQECMQUeP5O7jqJEkB-Us", true);

    api.connect(new FutureCallback<DiscordAPI>() {
      public void onSuccess(DiscordAPI discordAPI) {
        api.registerListener(new MessageCreateListener() {
          public void onMessageCreate(DiscordAPI discordAPI, Message message) {

            // + " words \n"
            if (message.getContent().equals("!도움말")) {
              message.reply("/p -----------------------------------------------\n"
                  + "-------------- 홍련의 해방자 --------------\n"
                  + "극 청룡, 극 주작, 극 츠쿠요미, 극 백호, 극 신룡, 극 락슈미, 극 스사노오, 극 뭐였지 나중에 나중에\n"
                  + "알파 영식 1층, 알파 영식 2층\n"
                  );
            } else if (message.getContent().equals("알파 영식 1층")) {
              message.reply("/p Alphascape v 1.0 (savage) <se.1>\n"
                  + "\n"
                  + "/p [해일 착탄/추적]\n"
                  + "/p 12시: MT/H1 / 6시: ST/H2\n"
                  + "/p ---------------------------------\n"
                  + "/p             [불꽃]              l [지진] TH: HP 풀/ DPS: 죽음의 초월\n"
                  + "/p           MT/D3             l                  ●\n"
                  + "/p H1/D1 ● H2/D2   l H1    MT      ST    H2\n"
                  + "/p            ST/D4             l D3    D1      D2    D4  ※ DPS 넉백 후 그자리에서 맞기\n"
                  + "/p ----------------------------------\n"
                  + "/p ■ 흑수정 세로처리법             ■ 흑수정 X처리법\n"
                  + "/p        D1/D2(※거리유지)           MT           ST\n"
                  + "/p            ★                                            D1   D2\n"
                  + "/p MT/ST/H1/H2                                   ★\n"
                  + "/p           D3                                           D3   D4\n"
                  + "/p                    D4(※견고마)           H1           H2");
            }








          }
        });
      }

      public void onFailure(Throwable throwable) {
        throwable.printStackTrace();
      }
    });


  }

}
