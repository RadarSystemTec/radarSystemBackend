package org.traccar.protocol;

import org.junit.Ignore;
import org.junit.Test;
import org.traccar.ProtocolTest;

public class TeltonikaProtocolDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        var decoder = inject(new TeltonikaProtocolDecoder(null, false));

        verifyNull(decoder, binary(
                "000F313233343536373839303132333435"));

        verifyPositions(decoder, binary(
                "00000000000003831004000001735ace37f80000e3b9331c71e290006900e211005100fd072e1600010100160300470300f00100150400b20000c80000ef01009000004f00005101005201005300005538006e00006f00007a03007d00007f5600890000fd0200fe1f09004326b00044000000b5000b00b6000600427029001800540046015d00ce4ec10080000f0f00f10000515400cd007404ab00d80f5022a1005000000054005400000000005600015568005700000060005800000420006800001113006d303330300071fffd8c85008700000020008800000002008a000155f5008b0000b86000000001735ace3ca80000e3b08a1c71dd29006900e311005100fd072e1600010100160300470300f00100150400b20000c80000ef01009000004f00005101005201005300005537006e00006f00007a03007d00007f5600890000fd0200fe1d09004326ac0044000000b5000b00b600060042701f001800540046015d00ce4ec10080000f0f00f10000515400cd007404ab00d80f5022ce00500000005400540000000000560001556800570000006000580000041f006800001113006d303330300071fffd8c85008700000020008800000002008a000155f5008b0000b86000000001735ace3fc80000e3a7c01c71d7c2006900e311005100fd072e1600010100160300470300f00100150400b20000c80000ef01009000004f00005101005201005300005537006e00006f00007a03007d00007f5600890000fd0200fe2309004326ac0044000000b5000b00b6000600427015001800540046015e00ce4ec10080000f0f00f10000515400cd007404ab00d80f5022e700500000005400540000000000560001556800570000006000580000041f006800001113006d303330300071fffd8c85008700000020008800000002008a000155f5008b0000b86000000001735ace3ffa0000e3a7c01c71d7c2006900e311005100fd072e1600010100160300470300f00100150400b20000c80000ef01009000004f00005101005201005300005537006e00006f00007a03007d00007f5600890000fd0300fe2309004326ac0044000000b5000b00b6000600427015001800540046015e00ce4ec10080000f0f00f10000515400cd007404ab00d80f5022e700500000005400540000000000560001556800570000006000580000041f006800001113006d303330300071fffd8c85008700000020008800000002008a000155f5008b0000b86000040000eb85"));

        verifyPositions(decoder, binary(
                "00000000000000e708030000018293d62060000de1f6a62159767e00000000000000000b074504f00050041500c801ef004f630342320043000344000001f100006019000000018291b0c790000de1f6a62159767e006e0144070000ef12074503f00050051505c800ef004f0207b5000eb6000b423324180000ce00dc43001144000004c700000007f100006019cd0003c7776300ea4e2e000000018291aff0b8000de1f91f21597405006f00f61300080012074503f00150051504c800ef014f0207b50009b600054236c1180008ce00dc43003f44000004c700000003f100006019cd0003c7776300ea4e2700030000a48d"));

        verifyPositions(decoder, binary(
                "00000000000000da08030000017fcedf499600280431be0eded45d0038012d100000fa100901000200b300b4004501500415034702fa00054232a1180000cd3b2fce281d43001f02c700000006f10000a029000000017fcedea99600280432070eded3dd00380046130009000f0801010200b300b400450150051502470205423276180009cd3b2fce281d43001f02c700000027f10000a0290000000179d50853180027f65d3f0ed67212001500f1110061000f0801010200b300b4004501500515034702054234f4180061cd53d1ce28c043003e02c700000147f1000000290003000052cb"));

        verifyPositions(decoder, binary(
                "00000000000000b98e0200000179555c7bf8010b3a1cfbebc142b00000000000000000ec000f000900f00000150000c80000450200710100740001070100fa0000ec01000500b500000018000000430d560044000000190000000100f1000000000000000000000179555c83c8010b3a1cfbebc142b0000000000000000185000f000900f00000150000c80000450200710100740001070100fa00018511000500b500000018000000430d560044000000190000000100f100000000000000000200003251"));

        verifyPositions(decoder, binary(
                "00000000000000a38e0100000178b11c9e1000040bbbc91f03190c002100e113001300000010000600ef0100f00100150300c800004501001e070005004237e00018000a00ce166200430f970024059f000300f10000665900c70000001e00100000a1b500000002010000115756315a5a5a32455a38363031353338380119002950303239392c50303637352c50303637342c50303637322c50303637312c50303437312c50324241430100001ad8"));

        verifyPositions(decoder, binary(
                "00000000000000858e0200000174431aadc100061d888f21000e8a0032002e0c000001810001000000000000000000010181001711210102030405060708090a0b0c0d0e0f10020b010ad000000174431a389100061d888f21000e8a0033002e0d000001810001000000000000000000010181001711210102030405060708090a0b0c0d0e0f10020b010ad2020000492b"));

        verifyPositions(decoder, false, binary(
                "000000000000001C0D01050000001056E924222347455420444154414F524445520D0A0100004990"));

        verifyPositions(decoder, false, binary(
                "00000000000000170D01050000000F0000016C0A81C320676574696E666F0100006855"));

        verifyPositions(decoder, false, binary(
                "000000000000004f0c01060000004755555555777730362e343b30342e323b30302e303b30302e303b30302e303b30302e303b30302e303b30302e303b30312e333b30302e303b31302e373b30302e303b5353530d0a010000e371"));

        verifyPositions(decoder, false, binary(
                "00000000000000100C010600000008010300010015D5C5010000D988"));

        verifyPositions(decoder, binary(
                "000000000000004c08010000016818d500580009c28d9f1cb3757a00be00c60f0053000f06f0011503c80001011d00fc0007423799180053cdf80dce426f430f88190bb8560bb802f100005aa110002887e000010000ee8d"));

        verifyPositions(decoder, binary(
                "00000000000000818e0100000166e368a510000f0d8b5b20961c35008d010308000000000014000900ef0000f00100500100150400c800004501001e00002500002900000a00b5000800b60007004230dc0018000000430fcb0044005f001103de001200e50013001200240000000000000001010000113141314a433534343452373235323336370100005e99"));

        verifyPositions(decoder, binary(
                "000000000000009D10020000013feb55ff74000f0ea850209a690000AE00B90B00000000070A050001000002000003000004000120000200180000004601290200C700000000004C0000000001003E00000000000000000000015B198C7498000F0DBC502095872F00AE00B90B00000000070A050001000002000003000004000120000200180000004601290200C700000000004C0000000001003E000000000000000002000009A5"));

        verifyPositions(decoder, binary(
                "000000000000009F100100000164D855401800D5E3B744EC11C762023B011A060000000007200A010000010500010600010D00010E00010F00011600011700011800011F001301010000010700000108000001090000010A0000010B0000010C000001100000011100000112000001130000011400000115000001190000011A0000011B0000011C0000011D0000011E000003010200000000010300000000010400000000000100000D3B"));

        verifyPositions(decoder, binary(
                "000000000000008c08010000013feb55ff74000f0ea850209a690000940000120000001e09FD01FE210300040016014703f0001504c8000c0900730a00460b00501300464306d7440000b5000bb60007422e9f180000cd0386ce000107c700000000f10000601a46000001344800000bb84900000bb84a00000bb84c00000000024e0000000000000000cf00000000000000000100003fca"));

        verifyPositions(decoder, binary(
                "00000000000000A708010000016269E7D9A8000A5A0F0A1CBF8F3300880046120000001C0801014F005100550F740073007801790103430000440000426F980B540000000056000045275700000047580000022659000000005D0000000068000003D07100007355870000000288000000008A000045270669584C5241534834336A30304731363538326B3600FFFFFF0000008155412055414430308230303039383236368330303000000000000100008396"));

        verifyPositions(decoder, binary(
                "0000000000000035080100000161f37c50500020de5ba60ef11450000000000000000006040100b300b400ef000109002000014e0000000000000000010000be52"));

        verifyPositions(decoder, binary(
                "000000000000008c08010000013feb55ff74000f0ea850209a690000940000120000001e09010002000300040016014703f0001504c8000c0900730a00460b00501300464306d7440000b5000bb60007422e9f180000cd0386ce000107c700000000f10000601a46000001344800000bb84900000bb84a00000bb84c00000000024e0000000000000000cf00000000000000000100003fca"));

        verifyPositions(decoder, binary(
                "0000000000000401080e0000015d12cc211000fadaf627186742f5000d0048080006000a040100f001500515000342318a430fe344000003c700000000f1000068b61000001b05000000015d12c6683800fadaf72118673f82000000000000000007030100f00050040342318a430fe344000001f1000068b6000000015d12bd407800fadaf72118673f82000000000000000007030100f000500403423179430fe144000001f1000068b6000000015d12b414d000fadaf72118673f82000400900c0000fa120a0100f00050051502080007010552090e6f4bfa000542316a430fe14400000600006202b203c700002328f1000068b61000001b05000000015d12b3074800fadaf2821867436a000400890d00170011090100f00150011502081007010553090e6f4d054231fb430fe14400000603ae6202a003c700002328f1000068b61000001b05000000015d12b2ff7800fadaee89186747c60005009a0d001d0011090100f00150011502081b07010553090e6f4d05423125430fe144000006050862029e03c700002328f1000068b61000001b05000000015d12b2e42000fadae8cf18675e0a000300a60d00210011090101f00150011502082407030554090e6f4d0542310a430fe14400000606cf62029703c700002328f1000068b61000001b05000000015d12b2d48000fadae05818676a16000400930c00240011090100f00150011502082207010554090e6f4e05423738430fe144000006066a62029303c700002328f1000068b61000001b05000000015d12b2a1b800fadac33e18678e48000600940d00150011090101f00150051500081907030553090e6f4e054239cc430fe14400000607c662028603c700002328f1000000001000001b05000000015d12b29dd000fadac19d18678fc8000700820d00110011090100f00150051500081607030553090e6f4e054238c8430fe14400000606d962028503c700002328f1000000001000001b05000000015d12b299e800fadabfa9186790e3000700670d00110011090101f00150051500081407030553090e6f4e054231e5430fe144000006060a62028403c700002328f1000000001000001b05000000015d12b2960000fadabd4018679104000600510d00120011090101f00150051500081207030553090e6f4e054231ce430fe144000006057062028303c700002328f1000000001000001b05000000015d12b27aa800fadaa96518678b7c000600470d00120011090101f00150051500081807030551090e6f4e05423a70430fe144000006074462027c03c700002328f1000000001000001b05000000015d12b276c000fadaa73f18678ae60006003b0d000e0011090101f00150051500081607030551090e6f4e05423a5a430fe14400000606b762027b03c700002328f1000000001000001b05000e000007a4"));

        verifyPositions(decoder, binary(
                "00000000000002cb08080000015a71ccbec00002fc9bfc1e53a1e00016004cf80005001914150216056500ee00ef00f0009d029e029f02a002a102a202a302a402a502a602020003000164d20003480100c6000ac500ce02c80000654ec700004ee8000000015a725aaac80002fc933c1e539d4000150049f80000001914150116056500ee00ef00f0009d029e029f02a002a102a202a302a402a502a602020003000164d200034800f4c6000ac500ce02c80000654ec700004ee8000000015a75a42c900002fc97d01e539640001d0008020000001914150016056500ee00ef00f0009d029e029f02a002a102a202a302a402a502a602020003000164d200034800f8c6000ac500ce02c80006ba5ac700004ee8000000015a75a440180002fc931c1e539b60001d00b9020001001914150016056500ee00ef00f0009d029e029f02a002a102a202a302a402a502a602020003000164d200034800fac6000ac500ce02c80006ba5ac700004ee8000000015a75a453a00002fc93601e539cc0001d015d0c0000001914150016056500ee00ef00f0009d029e029f02a002a102a202a302a402a502a602020003000164d200034800f9c6000ac500ce02c80006ba5ac700004ee8000000015a75a467280002fc93801e539cc0001d013c0c0000001914150016056500ee00ef00f0009d029e029f02a002a102a202a302a402a502a602020003000164d200034800f9c6000ac500ce02c80006ba5ac700004ee8000000015a75a47ab00002fc92cc1e539c80001d00b00c0000001914150016056500ee00ef00f0009d029e029f02a002a102a202a302a402a502a602020003000164d200034800f8c60004c5000a02c800003085c70006ba5a000000015a75a48e380002fc92ec1e539c40001d00410c0000001914150116056500ee00ef00f0009d029e029f02a002a102a202a302a402a502a602020003000164d200034800f8c6000ac500ce02c80000c83dc700004ee800080000e0b2"));

        verifyPositions(decoder, binary(
                "0000000000000000080100000113fc208dff00209cca800f14f650006f00d60400040004030101150316030001460000015d000100000000")); // invalid length and checksum

        verifyPositions(decoder, binary(
                "000000000000009f080400000159738f76b8012e13b796110ab27600d700000b00004e01000000014e000000000000000000000159738f6ee8012e13b796110ab27600d700000a00004e01000000014e01000b00791c179300000159738f6b00012e13b796110ab27600d700000a00004e01000000014e000000000000000000000159738f5f48012e13b796110ab27600d700000b00004e01000000014e01000b00791c17930400009671"));

        verifyPositions(decoder, false, binary(
                "00000000000000710c0106000000694154244d5347534e443d342c225354474234302c50522c3335363630313036303236353035302c313630343232313531372c313630343232313531382c432c2b3032332e332c302c2b3032332e312c302c4445414354492c302c4445414354492c302c312c30220d0a010000d8db"));

        verifyPositions(decoder, false, binary(
                "0000000000000055070450aa14320201f00150aa17f3031f42332a4c4193d68c008d00020901f00150aa1b6a031f423383f54193624f009d00000a01f00150aa1c230fc01a0000552b040164f400dd00f0010143100c0105000000050400006846"));

        verifyPositions(decoder, binary(
                "000000000000003508010000014f8e016420002141bbaf0f4e96a7fffa0000120000000602010047030242669c92000002c7000000009100000000000100002df3"));

        verifyPositions(decoder, binary(
                "00000000000000A7080400000113fc208dff000f14f650209cca80006f00d60400040004030101150316030001460000015d0000000113fc17610b000f14ffe0209cc580006e00c00500010004030101150316010001460000015e0000000113fc284945000f150f00209cd200009501080400000004030101150016030001460000015d0000000113fc267c5b000f150a50209cccc0009300680400000004030101150016030001460000015b00040000"));

        verifyPositions(decoder, binary(
                "000000000000014708060000013e5a60a4cb003fa7b780fc424518004200000a000000090501010200b300b400f000034268a746011818000001c700000000000000013e5dc8ba28003fa7c080fc4246040001000005000000090501010200b300b400f001034268b44600ef18000001c700000000000000013e5dc90455003fa7b640fc424388003a0000070000f0090501010200b300b400f000034268dc4600f718000001c70000001d000000013e5dc9d368003fa7b800fc4244300049000004000000090501010200b300b400f001034267de46010718000001c700000000000000013e5dca311d003fa7b680fc4243cc00420000070000f0090501010200b300b400f0000342685346010b18000001c700000000000000013e5dcfafe9003fa7b600fc4242f0003d000008000000090501010200b300b400f0000342685246011918000001c700000000000600000275"));

        verifyPositions(decoder, binary(
                "000000000000002c08010000013eff8d6f9800173295002111f400008100ae0b0000000401010003090016432980422f7200000100007a5d"));

        verifyPositions(decoder, binary(
                "00000000000000c7070441bf9db00fff425adbd741ca6e1e009e1205070001030b160000601a02015e02000314006615000a160067010500000ce441bf9d920fff425adbb141ca6fc900a2b218070001030b160000601a02015e02000314006615000a160067010500000cc641bf9d740fff425adbee41ca739200b6c91e070001030b1f0000601a02015f02000314006615000a160066010500000ca841bf9cfc0fff425adba041ca70c100b93813070001030b1f0000601a02015f02000314002315000a160025010500000c3004000000"));

        verifyPositions(decoder, binary(
                "000000000000003107024c61410b013f4231c2c141d0beb9003d000005006483ff4c6140eb013f4231c2c141d0beb9003d000005006483ff02000041df"));

        verifyPositions(decoder, binary(
                "000000000000002b080100000140d4e3ec6e000cc661d01674a5e0fffc00000900000004020100f0000242322318000000000100007a04"));

        verifyPositions(decoder, false, binary(
                "000000000000002d0c01060000002523464d323d3236323033323736313732313339362c32363230332c30372e30322e30350d0a0100009a2e"));

        verifyPositions(decoder, binary(
                "00000000000000a608010000013f14a1d1ce000f0eb790209a778000ab010c0500000000000000000100003390"));

        verifyPositions(decoder, binary(
                "000000000000004508010000015eb70a86d00024089d4d21dee3860137005f12005f000e06ef01f00150011503c800450108b5000bb6000642382718005fcd057ace19d3430f57440000000001000002bf"));

        verifyPositions(decoder, binary(
                "000000000000004a08010000015ebc1da508002411926621f15246010b00b913005e000f06ef01f00150011505c800450108b5000bb6000642381b18005ecd0318ce19cd430f5844000001f1000061a900010000c8e1"));

        decoder.setExtended(true);

        verifyPositions(decoder, false, binary(
                "0000000000000158080b0000015d4b4dc07a00d5dbd13eec04324e020e0000120000000000000000000000015d4b4cd5e800d5dbd13eec04324e020e0000120000000000000000000000015d4b4beb8800d5dbd13eec04324e020e0000130000000000000000000000015d4b4b012800d5dbd13eec04324e020e0000120000000000000000000000015d4b4a16c800d5dbd13eec04324e020f0000110000000000000000000000015d4b492c6800d5dbd13eec04324e020f0000110000000000000000000000015d4b48420800d5dbd13eec04324e020f0000120000000000000000000000015d4b4757a800d5dbd13eec04324e020f00000f0000000000000000000000015d4b466d4800d5dbd13eec04324e020f0000100000000000000000000000015d4b4582e800d5dbd13eec04324e020f0000110000000000000000000000015d4b44988800d5dbd13eec04324e020f0000110000000000000000000b0000ec10"));

        verifyPositions(decoder, false, binary(
                "00000000000003b5080b0000015ab5642a8800d5db1769ec01d70a020a00e3040004000e0501010200030004006000060900100a00010b0000130000422f1318000302c700000000f7000000000001cb000000000000000000000000000000000000015ab5642e7000d5db178aec01d6d6020a0070040003000e0501010200030004006000060900100a00000b0000130000422f1318000302c700000000f7000000000001cb000000000000000000000000000000000000015ab567050000d5db1805ec01da3c02060101040006000e05010102000300040060000609000f0a00010b0000130000422f0c18000302c700000046f7000000000001cb000000000000000000000000000000000000015ab56708e800d5db1723ec01d9ec020600e5040006000e05010102000300040060000609000f0a00010b0000130000422f1018000502c700000003f7000000000001cb000000000000000000000000000000000000015ab5685cc000d5db20f7ec01d8fa02080033050007000e05010102000300040060000609000f0a00010b0000130000422f0a18000502c700000030f7000000000001cb000000000000000000000000000000000000015ab5693b6800d5db2367ec01d9430211011b040006000e05010102000300040060000609000f0a00010b0000130000422f0c18000302c700000027f7000000000001cb000000000000000000000000000000000000015ab569433800d5db1fb2ec01d9310211008b040006000e0501010200030004006000060900110a00000b0000130000422f1318000402c700000009f7000000000001cb000000000000000000000000000000000000015ab56a0e5800d5db22a2ec01da5502100041050007000e05010102000300040060000609000f0a00000b0000130000422f1118000602c70000000ef7000000000001cb000000000000000000000000000000000000015ab56a700000d5db2afcec01ddb2020a0012050008000e05010102000300040060000609000e0a00000b0000130000422f0918000502c700000026f7000000000001cb000000000000000000000000000000000000015ab56a73e800d5db2ad8ec01de65020a014e050008000e05010102000300040060000609000f0a00010b0000130000422f0818000702c700000002f7000000000001cb000000000000000000000000000000000000015ab56a7bb800d5db2971ec01e00e020a013f040008000e0501010200030004006000060900100a00020b0000130000422f0b18000802c700000004f7000000000001cb000000000000000000000000000000000b00007c5f"));

    }


    @Test
    public void testDecodePhoto() throws Exception {

        var decoder = inject(new TeltonikaProtocolDecoder(null, false));

        verifyNull(decoder, binary(
                "000F313233343536373839303132333435"));

        verifyNull(decoder, binary(
                "00000000000000090c010D00000001000100000CD8"));

        verifyNull(decoder, binary(
                "000000000000000D0c010D0000000501598493ED01000018B2"));

        verifyNull(decoder, binary(
                "00000000000008130c010d0000080b02598493ED000000000800ffd8ffe000104a46494600010201006000600000ffdb0084000202020202020202020202020202020403020202020504040304060506060605060606070908060709070606080b08090a0a0a0a0a06080b0c0b0a0c090a0a0a01020202020202050303050a0706070a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0a0affc401a20000010501010101010100000000000000000102030405060708090a0b0100030101010101010101010000000000000102030405060708090a0b100002010303020403050504040000017d01020300041105122131410613516107227114328191a1082342b1c11552d1f02433627282090a161718191a25262728292a3435363738393a434445464748494a535455565758595a636465666768696a737475767778797a838485868788898a92939495969798999aa2a3a4a5a6a7a8a9aab2b3b4b5b6b7b8b9bac2c3c4c5c6c7c8c9cad2d3d4d5d6d7d8d9dae1e2e3e4e5e6e7e8e9eaf1f2f3f4f5f6f7f8f9fa1100020102040403040705040400010277000102031104052131061241510761711322328108144291a1b1c109233352f0156272d10a162434e125f11718191a262728292a35363738393a434445464748494a535455565758595a636465666768696a737475767778797a82838485868788898a92939495969798999aa2a3a4a5a6a7a8a9aab2b3b4b5b6b7b8b9bac2c3c4c5c6c7c8c9cad2d3d4d5d6d7d8d9dae2e3e4e5e6e7e8e9eaf2f3f4f5f6f7f8f9faffc000110801e002d003012200021101031101ffdd00040054ffda000c03010002110311003f00fc918d555b0c0007a8cd4e3054a8c807a64540a32d900f07e626ac2fce0f4014718ae652ba68e87ef222238da4f20f415226d00823a838045210149cf24fbd30305c31391cf18a52574269ad2c49b9be518c60d4dbb0194003232323b542092509e840c0a9304120e4827068924e5a8db761a0971b402011c1229ea02608f5ebeb4a09fba00001eb520552a001c83d09a1493d1149a48455009dc4020f029f210a98079a52a32a091b8f24d23042c41c93fc38a517a89b6f61b19dc371c923a1a9631f2b8639c1e326a280124ae0804fe55232153819c93924d17698452488c079380792dc1c5491a80e10825327f3a7b60052a36e4f069e9d77b1c053d4d24d3634aeee3769f31890060f03da9f364c6029cee5e09a7125db790013d69a49200000eb4ecbd0a5749d86a10ab1a827716c64d3d57639181ce4e29c880216246e43c12296360e0c8c4865e9c76a7169bb762534da18b1b3fdfc003a0a951004236e5b77ca49a8959c48a013f33723daa74604c84f0a0e011d8d36d27a83936c67987718c819cf20fa54ae018f6648048c0c74a810b1901009603a9ed53005958900943920f7a9d131deeb41854064519c01c934e000914124865e49a7901ca903af63da918a96418c91c311495a49836e438f240ebb4fcbf4a7a16219828000232691f3953c023a01446e49008da83ef0f5a6acb71249a41b4642331e0f5a7b8023193f311c81e94e5da496750016ea476a64b2050495279f9463b51aa2ac86a200c1412081c9a9810d2384206178c1a8d010a1ca92d8fc853e37551900167079a4db6ef70bc799362f963682c3073dfbd2e49508848e7e6a79264894e3033900543138569093b8b82001d8d5dd2d985d262801880bcaaf1c1ef52b92c91c600c27041f4a6292acaa9c0c724fad293f3161938eb93509b6f713695d844586e00e060e38a72260b9e8aab9247a546a30c40242b8e07a54b9fbca092ae3814ee9ec4ab45a60c140c81b8b918149b0b2ba3120eee707a5354b052554e54f04f6a7a9561b413bcb0249345d25a17a5ee3c81e5a804860723029502bec2fdb8201ea69db39c90403f74fb5359580057ef6780294527aafe98ad1487ae017278dab900d47390c8072188f978ef52e0b48c41fbc3048a6381bd41390a791449a6c4af263f0ab124472485cb0f53532c8137a6727193c77a81582caace7200e38a7be7cc9b6a819192cc78a77567b84795a240ac0463000232e734b127254fde4078a7021d22232d82371f4a69251caa900b3e4367b526928bbf512516eec91103204271d720fd6a605427cbc04e066aaa615d482483d81ef53306024503049c939e94dd96a55d5c6c6518b316e431c71d6a78c99033138c1f947ad5451f3aae7193f301eb5ad02a44c430071cb023a524d3d413e87b0e829245f0f3c73242e229e4f095e209ca062a1e278fa3023a39edeb5f13ce144ae01dc3770718afb5bc3e88fe0bf1c1b8252de4f09de9322a92630b113b801d4fe07815f155cb0695982ed19e00aceed55934fa47ff6ef989abc48c0cf23800f5cd3d4f24e38238a8949c00304e79a901e7a678a1b5ad898b492255c024824e48e2a55272307041a8548c01d077352a9c923ae2a559bd4a6d264c0e060f04f7a9800001ebd6a01b7007383d2a75008039a4d3be80f995c82f0916f290707674f5aa5e1c19b9949e3e4e3f3ab97b9fb34a31c05e9557c3a019a50724003b576615e8ccab5940ee62c123af5e302aeaf0463a8355225276e3a0ee2ad82474e83b115d8d7bda9cea4921aec76b678c83d6a9d9f319c1c658f22adc9cab6464e0e00aab60018723b93835c59838ac3dcebc124f106cdaa8dcbcf39afa13e0fc65b5e848c83b3e519ef91fe35f3f5a801973d8f15f48fc148fcdf10da2f003ca8a491dcbafaf7e2be2f3549e1a4bb9f474928c6ecfdd5d1a309a7d928fe1b68c0c7fbb5d1c28db01c77ac7d3d156de054185f2d76fd315d25a85d801e7938cd7d2609bf6d7f53e66ac7f77a010000b7cd"));

    }

    @Ignore
    @Test
    public void testDecodeConnectionless() throws Exception {

        var decoder = inject(new TeltonikaProtocolDecoder(null, true));

        verifyPositions(decoder, false, binary(
                "0049cafe0122000f33353734353430373237313339373508010000015d3766f6a800003eef961ec6215e0063006d09003100070401000200f001c8000242381c18003201c7000000e10001"));

    }

}
