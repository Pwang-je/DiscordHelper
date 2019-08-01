import com.google.common.util.concurrent.FutureCallback;

import de.btobastian.javacord.DiscordAPI;
import de.btobastian.javacord.Javacord;
import de.btobastian.javacord.entities.message.Message;
import de.btobastian.javacord.listener.message.MessageCreateListener;

public class BotHelper {

  // FFXIV Ggang Chong! Duty Macro.

  static public void main(String args[]) {
    final DiscordAPI api = Javacord.getApi("this.token", true);

    api.connect(new FutureCallback<DiscordAPI>() {
      public void onSuccess(DiscordAPI discordAPI) {
        api.registerListener(new MessageCreateListener() {
          public void onMessageCreate(DiscordAPI discordAPI, Message message) {

            // + " words \n"
            if (message.getContent().equals("!도움말")) {
              message.reply("/p -----------------------------------------------\n"
                  + "-------------- 홍련의 해방자 --------------\n"
                  + "극 청룡, 극 주작, 극 츠쿠요미, 극 백호, 극 신룡, 극 락슈미, 극 스사노오, 극 주르반, 극 뭐였지 나중에 나중에\n"
                  + "알파 영식 1층, 알파 영식 2층\n"
                  );
            } else if (message.getContent().equals("알파 영식 1층")) {
              message.reply("/p Alphascape v 1.0 (savage) <se.1>\n"
                  + "/p [해일 착탄/추적]\n"
                  + "/p 12시: MT/H1 / 6시: ST/H2\n"
                  + "/p ---------------------------------\n"
                  + "/p             [불꽃]              l [지진] TH: HP 풀/ DPS: 죽음의 초월\n"
                  + "/p            MT/D3             l                  ●\n"
                  + "/p    H1/D1 ● H2/D2   l H1    MT      ST    H2\n"
                  + "/p             ST/D4             l D3    D1      D2    D4  ※ DPS 넉백 후 그자리에서 맞기\n"
                  + "/p ----------------------------------\n"
                  + "/p ■ 흑수정 세로처리법             ■ 흑수정 X처리법\n"
                  + "/p        D1/D2(※거리유지)           MT           ST\n"
                  + "/p            ★                                            D1   D2\n"
                  + "/p MT/ST/H1/H2                                   ★\n"
                  + "/p           D3                                           D3   D4\n"
                  + "/p                    D4(※견고마)           H1           H2");
            } else if(message.getContent().equals("알파 영식 2층")) {
              message.reply("/p Alphascape v 2.0 savage <se.1> (2번징 9시쪽)\n"
                  + "/p ---------------------------------\n"
                  + "/p ○+○= 외부이동 ㅣ│+○= 징으로 산개\n"
                  + "/p ○+│= 내부이동 ㅣ│+│= 4층전반 방패옵션 산개\n"
                  + "/p ---------------------------------\n"
                  + "/p [기본 산개]     l      [징으로 산개]\n"
                  + "/p D3  MT D4     l           MT/D3\n"
                  + "/p H1  ★  H2       l H1/D1  ★ H2/D2\n"
                  + "/p D1  ST  D2       l            ST/D4\n"
                  + "/p ---------------------------------\n"
                  + "/p [마법장벽] ST 습득 후 2번징에서 전달\n"
                  + "/p [번개징] 각자 안겹치게 산개\n"
                  + "/p [엑사플레어&아크몬] - 엑사플레어 첫번째 지점에서 아크몬 맞기\n"
                  + "/p [핫테일] MT- 11시로 이동-가운데-이후 구슬터지면 11시로 이동 핫테일 맞기/본진은 5시에서 중앙 이동- 이후 7시로 이동(구슬터지면 이동)");
            } else if (message.getContent().equals("극 청룡")) {
              message.reply("/p -----------------------------------------------\n"
                  + "/p ■줄 끊기: ←MT　ST→\n"
                  + "/p ■큰 쫄 침묵: 1번째(MT), 2번째(ST)\n"
                  + "/p -----------------------------------------------\n"
                  + "/p     【각자 산개 위치】\n"
                  + "/p              A\n"
                  + "/p 　D3/MT　    D4/ST　　 \n"
                  + "/p 　　       ▲        　     \n"
                  + "/p 　D1/H1　　  D2/H2    　 \n"
                  + "/p              C\n"
                  + "/p -----------------------------------------------\n"
                  + "/p ■2연속 직선 쉐어징 [A징 기준]\n"
                  + "/p A측면(북): MT ST H1\n"
                  + "/p C측면(남): H2 D1 D2 D3 D4\n"
                  + "/p ----------------------------------------------");
            } else if (message.getContent().equals("극 백호")) {
              message.reply("/p   ▽건곤일척▽\n"
                  + "/p   첫번째 쉐어　MT　H1　D1　D2\n"
                  + "/p   두번째 쉐어　ST　H2　D3　D4\n"
                  + "/p   ▽무간지옥[재앙풍, 마커]▽\n"
                  + "/p  <필드를 3등분 하여 각각의 자리로 산개>\n"
                  + "/p     A - 탱커　  B - 힐러　   C - 딜러\n"
                  + "/p   타이밍 맞춰 2쫄 탱리밋");
            } else if (message.getContent().equals("극 주작")) {
              message.reply("/p 　　 　《극 주작 산개》\n"
                  + "/p 　　　　　D1\n"
                  + "/p 　　MT　　MT　　H2\n"
                  + "/p 　　　D1　　　　D2\n"
                  + "/p 　　　　　　   ·\n"
                  + "/p  D4H1　　주작　　H2D2\n"
                  + "/p 　　　　　　   ·\n"
                  + "/p 　　　D4　　　　D3\n"
                  + "/p 　　H1　　ST　　ST\n"
                  + "/p 　　　　　D3\n"
                  + "/p    ※돌진 : 안쪽 산개위치 기준");
            } else if(message.getContent().equals("극 신룡")) {
              message.reply("/p ◆기본산개도(번개탄)  l  ◆     아토믹 레이 \n"
                  + "/p 　  T1　 T2            l　  징 집합 후 사슬 연결되면 산개\n"
                  + "/p   D1　　　D2         l　     T1 D1　   　 T2 D2\n"
                  + "/p   D3　　　D4         l 　              징\n"
                  + "/p    H1　  H2           l　     H1 D3　  　  H2 D4\n"
                  + "/p  -------------------------------------------------------\n"
                  + "/p ■  아 크 몬 【둘이 맞기(생존기) → 메인탱 무적 → 서브탱 무적】\n"
                  + "/p ■  다이아몬드 더스트  →  H1이 이동\n"
                  + "/p ■  대지의 숨결      I  ←힐러　 ◎    딜러→\n"
                  + "/p ■  쫄페 운석 외각   I           본진\n"
                  + "/p          [ 꼬리  (녹색징)]\n"
                  + "/p     BOSS        ( 힐 → 딜 → 탱 )\n"
                  + "/p  탱   ■   ■         3   ■  ■\n"
                  + "/p  ■   탱   ■   =    ■   3  ■\n"
                  + "/p  딜   ■    힐        2   ■   1");
            } else if(message.getContent().equals("극 락슈미")) {
              message.reply("/p 일단 고고. 서브탱님 부채꼴 범위공격만좀 옆으로. (뒤로빼면 다 죽일수 있음 참고.)\n"
                  + "/p 락슈미 화나면 버블 그냥 일단 쓸것."
                  + "/p 12시 탱둘, 9시 힐2 딜1, 6시 딜2 딜3, 3시 힐1 딜4 : 정신착란(기술 이름이?)때 \n");
            } else if(message.getContent().equals("극 스사노오")) {
              message.reply("/p 일단 고고. 번개 직선 잘못깔면 다죽음. x자로 보스 꽁무늬에 맞출것. 해풍참 도발요.\n"
                  + "/p 주사위 짤짤이 잘 깰것.\n"
                  + "/p 칼막을때 서브탱은 3시 -> 6시 -> 9시 돌면서 구슬먹을것.\n"
                  + "/p 용기사님 점프 조심좀.!important \n"
                  + "/p 용기사님 점프좀.\n"
                  + "/p 용기사님 점프...\n"
                  + "/p 아 제발..\n");
            } else if(message.getContent().equals("극 츠쿠요미")) {
              message.reply("/p ■ 초저녁의 재빠른 환복\n"
                  + "/p 　총: 보스 뒤로 (나눠맞기)\n"
                  + "/p 　청: 산개\n"
                  + "/p 　　 ＼ T ／　(정면:북)\n"
                  + "/p     　Ｈ ☆ Ｈ　\n"
                  + "/p 　　 ／ D ＼\n"
                  + "/p ■ 쫄페\n"
                  + "/p 　원딜 쫄:MT　근딜 쫄:ST\n"
                  + "/p ■ 운석\n"
                  + "/p 　Ｔ: A（좁은 쪽 바닥）\n"
                  + "/p 　Ｈ: B or D（넓은 쪽 바닥）\n"
                  + "/p 　Ｄ: C （좁은 쪽 바닥）");
            } else if(message.getContent().equals("극 주르반")) {
              message.reply("/파                      \uE083\uE07F\uE071\uE082 \uE07D\uE071\uE073\uE082\uE07F\n"
                  + "/파     《쌀모양 비상》    |        《강 모양 비상》\n"
                  + "/파   전조가 A에 안겹침          전조가 A에 겹침\n"
                  + "/파                  A                 |                 A\n"
                  + "/파          \\MT/ST /          |          \\\\   || MT+ST\n"
                  + "/파     D1  \\         / D2     |     D1  \\\\||        D2\n"
                  + "/파   B ----   /   \\   ------     |   ------    \\||\\    ------- C\n"
                  + "/파     D3  /       \\ D4       |        D3  ||\\\\     D4\n"
                  + "/파           / H+H \\            |      H+H ||  \\\\");
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
