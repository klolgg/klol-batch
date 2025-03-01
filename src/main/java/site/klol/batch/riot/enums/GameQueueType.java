package site.klol.batch.riot.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum GameQueueType {

    SOLO(420, "솔로랭크"),
    NORM(430,"일반게임"),
    FLEX(440,"자유랭크"),
    ARAM(450, "칼바람");
    private int rankCode;
    private String description;

    public boolean isSoloRank(int queueType) {
        return SOLO.rankCode == queueType;
    }
}

/*

Riot API 큐 타입 예시

const QUEUETYPE = {
    400: 'norm', //Normal Draft Pick
    420: 'solo',
    430: 'norm',
    440: 'flex',
    450: 'aram',
    700: 'clash',
    800: 'ai',  // Deprecated
    810: 'ai',  // Deprecated
    820: 'ai',  // Deprecated
    830: 'ai',
    840: 'ai',
    850: 'ai',
    900: 'urf',
    920: 'poro',
    1020: 'ofa',
    1300: 'nbg',
    1400: 'usb', // Ultimate Spellbook
    2000: 'tut',
    2010: 'tut',
    2020: 'tut',
}

const ko = {
  "solo": "솔랭",
	"norm": "일반",
	"aram": "칼바람",
	"flex": "자랭",
	"nbg": "돌넥",
	"usb": "궁주문서",
	"urf": "URF",
	"ofa": "단일",
	"ai": "AI대전",
	"poro": "포로왕",
	"tut": "튜토리얼",
	"etc": "기타",
	"clash": "격전"
}
     **/
