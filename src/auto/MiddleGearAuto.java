package auto;

public class MiddleGearAuto {
	public static final double[][] leftPath = {
			{0.000004910340332702136,0.05892408399242562,0.01},
			{0.000024551596194007086,0.1178475351678297,0.01},
			{0.00006874390771955058,0.265153869153261,0.01},
			{0.0001473062593541323,0.4713741098074902,0.01},
			{0.0002700554298593638,0.7364950230313891,0.01},
			{0.00044680458701780825,1.0604949429506663,0.01},
			{0.0006873615320377987,1.443341670119943,0.01},
			{0.001001526594774465,1.8849903764199976,0.01},
			{0.001399090180990632,2.3853815172970023,0.01},
			{0.0018898299741509823,2.944438758962102,0.01},
			{0.002483507793357044,3.5620669152363695,0.01},
			{0.0031898661120762345,4.2381499123151425,0.01},
			{0.004018624240348583,4.972548769634094,0.01},
			{0.004979474174898073,5.76509960729694,0.01},
			{0.006082076125912775,6.615611706088211,0.01},
			{0.0073360537224022365,7.523865578936772,0.01},
			{0.008750988905965719,8.489611101380895,0.01},
			{0.01033641652517462,9.512565715253409,0.01},
			{0.012101818630531079,10.592412632138755,0.01},
			{0.014056618493899093,11.728799180208089,0.01},
			{0.016210174352207105,12.921335149848076,0.01},
			{0.018571772893107043,14.169591245399637,0.01},
			{0.02115062250262873,15.473097657130127,0.01},
			{0.02395584628134064,16.831342672271465,0.01},
			{0.026996474846004648,18.243771387984037,0.01},
			{0.030281438941934656,19.70978457558005,0.01},
			{0.033819561883795354,21.228737651164185,0.01},
			{0.03761955182405647,22.799939641566684,0.01},
			{0.04168999391365999,24.4226525376211,0.01},
			{0.04603934232106302,26.096090444418174,0.01},
			{0.05067591218132946,27.81941916159865,0.01},
			{0.05560787147480557,29.59175576085668,0.01},
			{0.06084323284449626,31.412168218144124,0.01},
			{0.06638984542509177,33.27967548357305,0.01},
			{0.0722553866477096,35.193247335706985,0.01},
			{0.07844735409432942,37.15180467971891,0.01},
			{0.084973057407132,39.154219876815525,0.01},
			{0.09183961027203366,41.19931718940997,0.01},
			{0.09905392250648493,43.28587340670763,0.01},
			{0.10662269230508023,45.412618791571816,0.01},
			{0.11455239861531688,47.57823786141987,0.01},
			{0.12284929371147056,49.78137057692207,0.01},
			{0.1315193959736779,52.02061357324409,0.01},
			{0.14056848290751728,54.29452160303632,0.01},
			{0.15000208440925705,56.60160901043861,0.01},
			{0.15982547634880945,58.94035163731433,0.01},
			{0.1700436743881935,61.30918823630444,0.01},
			{0.18066142823554796,63.7065230841267,0.01},
			{0.19168321617770462,66.13072765294005,0.01},
			{0.20311324003233258,68.58014312776771,0.01},
			{0.21495542053561012,71.05308301966517,0.01},
			{0.2272133931133145,73.54783546622632,0.01},
			{0.23989050422238722,76.06266665443628,0.01},
			{0.2529853264605591,78.5689334290311,0.01},
			{0.2664917642045476,81.03862646393124,0.01},
			{0.2804036059180858,83.47105028122891,0.01},
			{0.29471453326552,85.86556408460527,0.01},
			{0.3094181303911459,88.22158275375557,0.01},
			{0.3245078933723075,90.53857788696965,0.01},
			{0.33997723988385226,92.81607906926857,0.01},
			{0.3558195191723702,95.0536757311078,0.01},
			{0.3720280221684127,97.25101797625483,0.01},
			{0.3885959921451386,99.40781986035559,0.01},
			{0.4055166357333271,101.52386152913073,0.01},
			{0.42278313432373504,103.59899154244789,0.01},
			{0.44038865626507884,105.63313164806284,0.01},
			{0.45832636954341893,107.62627967004062,0.01},
			{0.47658945535494013,109.5785148691271,0.01},
			{0.4951711224634859,111.49000265127447,0.01},
			{0.514064622594806,113.36100078792079,0.01},
			{0.5332632669427856,115.19186608787719,0.01},
			{0.552760443924135,116.98306188809649,0.01},
			{0.5725496381968223,118.73516563612307,0.01},
			{0.5926244512886693,120.44887855108202,0.01},
			{0.6129786238272273,122.12503523134822,0.01},
			{0.6336060594811512,123.76461392354356,0.01},
			{0.654500850878628,125.36874838486018,0.01},
			{0.6756573074465687,126.93873940764428,0.01},
			{0.6970699855489655,128.47606861438086,0.01},
			{0.7187337207170265,129.98241100836577,0.01},
			{0.740639883288373,131.43697542807936,0.01},
			{0.7627765510538826,132.82000659305737,0.01},
			{0.7851324046255592,134.13512143005926,0.01},
			{0.8076967612180319,135.3861395548359,0.01},
			{0.8304596082785922,136.57708236336177,0.01},
			{0.853411636680214,137.7121704097305,0.01},
			{0.8765442732274522,138.79581928342924,0.01},
			{0.8998497119680315,139.8326324434759,0.01},
			{0.9233209441181041,140.82739290043514,0.01},
			{0.9469517860313201,141.78505147929656,0.01},
			{0.9707369045534144,142.71071113256588,0.01},
			{0.9946718397139441,143.60961096317808,0.01},
			{1.0187530236151607,144.48710340729912,0.01},
			{1.0429777954670636,145.34863111141684,0.01},
			{1.067344411827977,146.19969816547967,0.01},
			{1.0918520517228962,147.04583936951607,0.01},
			{1.1165008160043004,147.89258568842476,0.01},
			{1.1412917203931825,148.7454263332923,0.01},
			{1.1662266819652618,149.6097694324755,0.01},
			{1.1913084984651885,150.49089899956064,0.01},
			{1.2165408202856596,151.39393092282603,0.01},
			{1.2419281149824004,152.32376818044514,0.01},
			{1.2674756241234524,153.28505484631148,0.01},
			{1.29318931262671,154.28213101954563,0.01},
			{1.3190758107881366,155.3189889685596,0.01},
			{1.3451423492654004,156.39923086358306,0.01},
			{1.3713966875817771,157.52602989825976,0.01},
			{1.3978470367274987,158.70209487432956,0.01},
			{1.4245019765838365,159.92963913802703,0.01},
			{1.4513703690810142,161.210354983066,0.01},
			{1.4784612680014824,162.54539352280833,0.01},
			{1.5057838265083496,163.9353510412042,0.01},
			{1.5333472034346554,165.3802615578339,0.01},
			{1.5611604695256496,166.87959654596477,0.01},
			{1.5892325146954203,168.43227101862394,0.01},
			{1.617571957407355,170.03665627160925,0.01},
			{1.646187057254389,171.69059908220356,0.01},
			{1.6750856316597065,173.39144643190406,0.01},
			{1.7042749776060773,175.13607567822518,0.01},
			{1.7337617991347187,176.92092917184914,0.01},
			{1.7635521412520465,178.7420527039672,0.01},
			{1.7936513307282753,180.59513685737295,0.01},
			{1.8240639241525203,182.4755605454698,0.01},
			{1.854793663435957,184.3784357006205,0.01},
			{1.8858434388675194,186.2986525893749,0.01},
			{1.9172152596383765,188.2309246251421,0.01},
			{1.9489102316627773,190.16983214640575,0.01},
			{1.9809285424337462,192.1098646258134,0.01},
			{2.0132694525180237,194.04546050566398,0.01},
			{2.0459312932798204,195.97104457078,0.01},
			{2.0789114702980402,197.8810621093183,0.01},
			{2.1122064719450084,199.77000988180953,0.01},
			{2.1458080989781654,201.6097621989424,0.01},
			{2.179707126300674,203.394163935051,0.01},
			{2.21389717501521,205.14029228721589,0.01},
			{2.2483710224807165,206.84308479303797,0.01},
			{2.2831206294223194,208.49764164961863,0.01},
			{2.3181371688565733,210.09923660552286,0.01},
			{2.3534110562740387,211.6433245047927,0.01},
			{2.3889319806740703,213.1255464001909,0.01},
			{2.424688936123553,214.54173269689593,0.01},
			{2.4606702534628697,215.8879040358989,0.01},
			{2.4968636319350495,217.16027083307955,0.01},
			{2.533256170440619,218.35523103341706,0.01},
			{2.5698343983498977,219.46936745567086,0.01},
			{2.606584305631669,220.4994436906296,0.01},
			{2.6434913722653395,221.4423998020211,0.01},
			{2.680540596828225,222.29534737731512,0.01},
			{2.7177165243198895,223.0555649499849,0.01},
			{2.7550032731073144,223.72049272454856,0.01},
			{2.7923845611156413,224.28772804996098,0.01},
			{2.829843731269815,224.75502092504146,0.01},
			{2.8673637762499644,225.1202698808966,0.01},
			{2.904927362670536,225.3815185234305,0.01},
			{2.9425168547163922,225.5369522751364,0.01},
			{2.9801143373875587,225.58489602699896,0.01},
			{3.0177016394177687,225.52381218125868,0.01},
			{3.0552603559514866,225.35229920230606,0.01},
			{3.0927718711092056,225.06909094631305,0.01},
			{3.1302173804898388,224.6730562838002,0.01},
			{3.1675779137144855,224.16319934788143,0.01},
			{3.204834357070509,223.5386601361408,0.01},
			{3.241967476316567,222.79871547634556,0.01},
			{3.2789579396938797,221.94278026387641,0.01},
			{3.315786341172031,220.97040886890804,0.01},
			{3.352433223955647,219.88129670169545,0.01},
			{3.388879104236343,218.67528168417533,0.01},
			{3.4251044951905087,217.35234572499635,0.01},
			{3.4610899311946994,215.9126160251429,0.01},
			{3.496815992190481,214.35636597468982,0.01},
			{3.53226332816184,212.68401582815238,0.01},
			{3.567412683657476,210.89613297381788,0.01},
			{3.6022449222218342,208.9934313861504,0.01},
			{3.6367410507135745,206.97677095044227,0.01},
			{3.6708822433146886,204.84715560668553,0.01},
			{3.7046498651948188,202.60573128077985,0.01},
			{3.7380254956300187,200.25378261119923,0.01},
			{3.7709909505005714,197.7927292233174,0.01},
			{3.8035283040070795,195.22412103904833,0.01},
			{3.835619909462221,192.54963273084786,0.01},
			{3.867248419029203,189.77105740189052,0.01},
			{3.8983968022793216,186.89029950071094,0.01},
			{3.9290483634262188,183.90936688138407,0.01},
			{3.9591867570775134,180.8303619077668,0.01},
			{3.9887960024641083,177.65547231957018,0.01},
			{4.017865456596033,174.41672479154613,0.01},
			{4.046390089424423,171.14779697034336,0.01},
			{4.074365525523479,167.8526165943387,0.01},
			{4.1017877783026115,164.53351667479447,0.01},
			{4.1286532421225735,161.19278291977258,0.01},
			{4.154958683678922,157.83264933809136,0.01},
			{4.180701232661311,154.45529389433221,0.01},
			{4.20587837171282,151.06283430905455,0.01},
			{4.230487925750522,147.6573242262092,0.01},
			{4.254528050685482,144.24074960976444,0.01},
			{4.277997221568479,140.81502529798118,0.01},
			{4.3008942202035,137.3819918101271,0.01},
			{4.323218122317069,133.94341268141446,0.01},
			{4.344968284271002,130.50097172359833,0.01},
			{4.366144329411244,127.0562708414534,0.01},
			{4.386746134098141,123.61082812138305,0.01},
			{4.4067738134258185,120.16607596606445,0.01},
			{4.426227706748672,116.72335993711977,0.01},
			{4.445108362992991,113.28393746591097,0.01},
			{4.463416525852128,109.84897715482377,0.01},
			{4.481153118892221,106.4195582405596,0.01},
			{4.498319230603717,102.99667026897242,0.01},
			{4.514916099471527,99.5812132068632,0.01},
			{4.530945099083597,96.17399767241889,0.01},
			{4.546407723328537,92.77574546963821,0.01},
			{4.561305571725605,89.38709038240532,0.01},
			{4.575640334916626,86.008579146129,0.01},
			{4.589418610040437,82.66965074286672,0.01},
			{4.602652101280791,79.40094744212293,0.01},
			{4.615352753473689,76.20391315738884,0.01},
			{4.627532488249566,73.0784086552597,0.01},
			{4.639203194224066,70.02423584700196,0.01},
			{4.650376718296959,67.04114443735853,0.01},
			{4.661064858031214,64.12883840552496,0.01},
			{4.671279355022809,61.28698194957058,0.01},
			{4.681031889249332,58.51520535914161,0.01},
			{4.690334074308699,55.813110356201534,0.01},
			{4.699197453512917,53.180275225309344,0.01},
			{4.70763349677268,50.61625955858257,0.01},
			{4.7156535982267815,48.12060872460957,0.01},
			{4.723269074558574,45.692857990753616,0.01},
			{4.730491163944634,43.33253631636146,0.01},
			{4.737331025592144,41.03916988505938,0.01},
			{4.743799739809683,38.812285305233516,0.01},
			{4.749908308562486,36.651412516819306,0.01},
			{4.755667656468903,34.55608743850183,0.01},
			{4.761088632191335,32.52585433459004,0.01},
			{4.766182010173589,30.560267893524614,0.01},
			{4.770958492692464,28.65889511324866,0.01},
			{4.775428712173755,26.821316887749916,0.01},
			{4.779603233741204,25.04712940469266,0.01},
			{4.783492557958205,23.335945302004106,0.01},
			{4.787107123730753,21.687394635290705,0.01},
			{4.7904573113381135,20.101125644158028,0.01},
			{4.793553445560253,18.576805332836663,0.01},
			{4.796405798875929,17.114119894055005,0.01},
			{4.7990245947000805,15.712774944910228,0.01},
			{4.801420010641632,14.372495649306762,0.01},
			{4.803602181754034,13.093026674411853,0.01},
			{4.805581203759338,11.874132031828374,0.01},
			{4.80736713622576,10.715594798527233,0.01},
			{4.808970005681893,9.617216736799273,0.01},
			{4.810399808648703,8.578817800860557,0.01},
			{4.811666514577775,7.600235574430572,0.01},
			{4.812780068680053,6.681324613665563,0.01},
			{4.813750394633985,5.8219557235935735,0.01},
			{4.814587397163143,5.022015174947567,0.01},
			{4.815300964472776,4.281403857797561,0.01},
			{4.815900970538152,3.600036392256378,0.01},
			{4.816397277237096,2.9778401936612338,0.01},
			{4.816799736320935,2.414754503037982,0.01},
			{4.817118191218747,1.91072938687066,0.01},
			{4.817362478670679,1.465724711591787,0.01},
			{4.817542430186941,1.0797090975715762,0.01},
			{4.817667873329823,0.7526588572922186,0.01},
			{4.817748632816529,0.4845569202347404,0.01},
			{4.817794531441436,0.2753917494443885,0.01},
			{4.817815390816574,0.12515625082785217,0.01},
			{4.8178210319297055,0.03384667878575639,0.01},
			{4.817821275519546,0.0014615390434308793,0.01},
			{4.817821275519546,0.0,0.01},
	};
	public static final double[][] rightPath = {
			{0.000004910340332702136,0.05892408399242562,0.01},
			{0.000024551807136170823,0.11784880082081212,0.01},
			{0.00006874562160411817,0.2651628868076841,0.01},
			{0.00014731416062999922,0.4714112341552863,0.01},
			{0.00027008200677639763,0.7366070768783904,0.01},
			{0.00044687735359564927,1.0607720809155097,0.01},
			{0.0006875337611930474,1.4439384455843889,0.01},
			{0.0010018922611053243,1.8861509994736607,0.01},
			{0.0013998038087962808,2.3874692861457394,0.01},
			{0.0018911320823190158,2.9479696411364094,0.01},
			{0.0024857566236188297,3.567747247798885,0.01},
			{0.003193576320670877,4.2469181823122835,0.01},
			{0.004024513225208187,4.985621427223858,0.01},
			{0.0049885167009190694,5.784020854265298,0.01},
			{0.006095567899614352,6.642307192171698,0.01},
			{0.0073556845541266945,7.560699927074053,0.01},
			{0.008778926082675872,8.539449171295065,0.01},
			{0.01037539899976837,9.578837502554986,0.01},
			{0.012155262614224295,10.679181686735552,0.01},
			{0.014128735016786721,11.840834415374559,0.01},
			{0.016306099333241297,13.064185898727455,0.01},
			{0.01869771023464388,14.349665408415495,0.01},
			{0.021314000696365083,15.697742770327213,0.01},
			{0.024165488981643612,17.10892971167117,0.01},
			{0.027262785833591485,18.58378111168723,0.01},
			{0.030616601865720388,20.12289619277341,0.01},
			{0.03423775513135129,21.72691959378543,0.01},
			{0.03813717883112945,23.39654219866897,0.01},
			{0.04232592918274902,25.13250210971744,0.01},
			{0.04681519337444033,26.93558515014785,0.01},
			{0.051616297630149556,28.806625534255357,0.01},
			{0.056740715338989445,30.746506253039342,0.01},
			{0.062200075209611044,32.75615922372958,0.01},
			{0.06800616947546058,34.83656559509724,0.01},
			{0.07417096206286314,36.98875552441533,0.01},
			{0.08070659674740904,39.2138081072754,0.01},
			{0.08762540525225246,41.512851029060485,0.01},
			{0.09493991525598697,43.88706002240702,0.01},
			{0.10266285828898263,46.337658197973916,0.01},
			{0.11080717752261883,48.865915401817205,0.01},
			{0.1193860353692948,51.47314708005582,0.01},
			{0.12841282091329417,54.160713263996264,0.01},
			{0.13790115712811804,56.93001728894326,0.01},
			{0.14786490786649953,59.78250443028892,0.01},
			{0.15831818457657823,62.7196602604722,0.01},
			{0.1692753527714118,65.74300916900144,0.01},
			{0.18075103810763898,68.85411201736298,0.01},
			{0.19276013224197394,72.0545648060098,0.01},
			{0.20531779823559468,75.3459959617244,0.01},
			{0.21843947560565571,78.73006422036616,0.01},
			{0.23214088498216023,82.20845625902719,0.01},
			{0.24643803224351465,85.78288356812651,0.01},
			{0.26134721227414914,89.45508018380687,0.01},
			{0.2768796731368122,93.1947651759786,0.01},
			{0.29304151038683107,96.971023500113,0.01},
			{0.3098389355290509,100.78455085331895,0.01},
			{0.3272782668578812,104.63598797298194,0.01},
			{0.34536592017182466,108.52591988366075,0.01},
			{0.36410839931187666,112.45487484031185,0.01},
			{0.38351228649258573,116.42332308425449,0.01},
			{0.40358423245544467,120.43167577715364,0.01},
			{0.42433094611498656,124.48028195725148,0.01},
			{0.44575918408077186,128.56942779471166,0.01},
			{0.46787573967071344,132.69933353964944,0.01},
			{0.49068743127850506,136.87014964674958,0.01},
			{0.514201090439746,141.08195496744602,0.01},
			{0.5384235489791505,145.33475123642648,0.01},
			{0.5633616255522155,149.62845943839022,0.01},
			{0.5890221111909171,153.96291383220984,0.01},
			{0.6154117539261108,158.33785641116216,0.01},
			{0.6425372423096601,162.75293030129575,0.01},
			{0.6704051877279553,167.2076725097713,0.01},
			{0.6990221052122793,171.7015049059433,0.01},
			{0.7283943929149206,176.2337262158483,0.01},
			{0.7585283099154727,180.8035020033126,0.01},
			{0.7894299521822985,185.409853600955,0.01},
			{0.8211052267536602,190.05164742816982,0.01},
			{0.8535598237388748,194.72758191128807,0.01},
			{0.8867991864138786,199.43617605002214,0.01},
			{0.9208284788293631,204.17575449290769,0.01},
			{0.9556465094953782,208.9081839960904,0.01},
			{0.9912455588572355,213.59429617114355,0.01},
			{1.027617304546794,218.23047413735074,0.01},
			{1.0647527875869485,222.81289824092693,0.01},
			{1.1026423787747681,227.33754712691805,0.01},
			{1.1412757454662688,231.80020014900413,0.01},
			{1.1806418191745955,236.19644224996085,0.01},
			{1.2207287640898101,240.521669491287,0.01},
			{1.2615239472864674,244.7710991799442,0.01},
			{1.3030139108713386,248.93978150922663,0.01},
			{1.3451843462590705,253.0226123263914,0.01},
			{1.3880200719319877,257.01435403750367,0.01},
			{1.431505014195861,260.90965358323945,0.01},
			{1.4756221924039343,264.7030692484401,0.01},
			{1.5203537085595733,268.38909693383334,0.01},
			{1.5656807422769674,271.9622023043642,0.01},
			{1.611583551465546,275.41685513147263,0.01},
			{1.6580414791189044,278.74756592014944,0.01},
			{1.705032967043653,281.9489275484914,0.01},
			{1.7525355764478614,285.01565642525037,0.01},
			{1.8005260158996033,287.9426367104516,0.01},
			{1.8489801769407794,290.72496624705707,0.01},
			{1.897873177163747,293.35800133780447,0.01},
			{1.9471794108613025,295.83740218533427,0.01},
			{1.9968726070604932,298.1591771951442,0.01},
			{2.0469258944591346,300.31972439184983,0.01},
			{2.0973118729481643,302.3158709341769,0.01},
			{2.148002691027072,304.14490847344473,0.01},
			{2.1989701283285017,305.80462380857705,0.01},
			{2.250185682487411,307.29332495345557,0.01},
			{2.301620659303547,308.6098608968162,0.01},
			{2.3532462652414368,309.75363562733924,0.01},
			{2.4050337010710354,310.7246149775908,0.01},
			{2.456954255667119,311.52332757650174,0.01},
			{2.508979398732978,312.15085839515126,0.01},
			{2.561080871380141,312.6088358829777,0.01},
			{2.6132307735787954,312.89941319192735,0.01},
			{2.665401647421301,313.0252430550337,0.01},
			{2.7175665553937716,312.98944783482295,0.01},
			{2.7696991528665924,312.7955848369252,0.01},
			{2.8217737541885075,312.4476079314899,0.01},
			{2.8737653918740826,311.9498261134498,0.01},
			{2.9256498685543275,311.30686008146796,0.01},
			{2.977403801446434,310.5235973526388,0.01},
			{3.0290046593220765,309.60514725385667,0.01},
			{3.0804307919823026,308.55679596135656,0.01},
			{3.1316614524188346,307.38396261919087,0.01},
			{3.1826768119723723,306.0921573212266,0.01},
			{3.2334579688169502,304.686941067469,0.01},
			{3.2839869502690617,303.1738887126688,0.01},
			{3.3342467093692636,301.55855460121074,0.01},
			{3.3842211162971445,299.8464415672846,0.01},
			{3.4338893953034257,298.00967403768794,0.01},
			{3.483231796475673,296.0544070334841,0.01},
			{3.5322350570442445,294.0195634114301,0.01},
			{3.58088675799828,291.9102057242146,0.01},
			{3.629175296878375,289.73123328056846,0.01},
			{3.677089858917044,287.48737223201533,0.01},
			{3.7246203868562553,285.1831676352676,0.01},
			{3.7717575498835543,282.82297816379486,0.01},
			{3.8184927121153893,280.4109733910098,0.01},
			{3.864817900875652,277.9511325615752,0.01},
			{3.9107257751072577,275.44724538963675,0.01},
			{3.956209594048519,272.902913647568,0.01},
			{4.001263186494614,270.32155467657066,0.01},
			{4.045880920644481,267.7064048991996,0.01},
			{4.09005767470798,265.0605243809916,0.01},
			{4.133788808271498,262.38680138110533,0.01},
			{4.17707013455282,259.6879576879357,0.01},
			{4.219897893400127,256.9665530838392,0.01},
			{4.262268725123564,254.22499034062224,0.01},
			{4.304179645059319,251.46551961453235,0.01},
			{4.345628018799359,248.6902424402368,0.01},
			{4.386611538044149,245.90111546874175,0.01},
			{4.427128196930694,243.09995331926666,0.01},
			{4.467176268807251,240.28843125934773,0.01},
			{4.506754283323956,237.46808710022918,0.01},
			{4.545861003732723,234.64032245259935,0.01},
			{4.584495404343149,231.80640366255625,0.01},
			{4.622656648006846,228.9674619821787,0.01},
			{4.660344063577363,226.12449342310464,0.01},
			{4.697557123264978,223.27835812569305,0.01},
			{4.734295419830996,220.42977939610688,0.01},
			{4.7705586435761775,217.57934247108682,0.01},
			{4.806346559089152,214.72749307784773,0.01},
			{4.841658981747739,211.87453595151715,0.01},
			{4.876495753955684,209.0206332476674,0.01},
			{4.91085672114387,206.16580312911523,0.01},
			{4.944741707567519,203.309918541894,0.01},
			{4.978150491923267,200.45270613448562,0.01},
			{5.011082782868688,197.59374567253016,0.01},
			{5.04353819452436,194.73246993402879,0.01},
			{5.0755162220007435,191.86816485830292,0.01},
			{5.107016217121493,188.9999707244979,0.01},
			{5.138037364372764,186.12688350762534,0.01},
			{5.168578657274051,183.24775740772355,0.01},
			{5.198638875228648,180.36130772758048,0.01},
			{5.228216561037158,177.46611485105876,0.01},
			{5.2573099991868455,174.56062889812435,0.01},
			{5.285917195050363,171.6431751811028,0.01},
			{5.314035855139886,168.7119605371359,0.01},
			{5.34166336856078,165.7650805253648,0.01},
			{5.368796789789277,162.8005273709826,0.01},
			{5.395432822874702,159.81619851255087,0.01},
			{5.4215678072600895,156.80990631232558,0.01},
			{5.447202078097629,153.8056250252349,0.01},
			{5.472340178274839,150.8286010632664,0.01},
			{5.496986483226705,147.87782971118892,0.01},
			{5.521144979559467,144.95097799657427,0.01},
			{5.5448192729135695,142.0457601246175,0.01},
			{5.568012596594231,139.15994208397225,0.01},
			{5.590727820919866,136.2913459538056,0.01},
			{5.6129674632449555,133.43785395053925,0.01},
			{5.634733698640604,130.59741237388877,0.01},
			{5.656028371190228,127.76803529774745,0.01},
			{5.67685300584281,124.94780791549448,0.01},
			{5.697208820776232,122.13488960052742,0.01},
			{5.717096740261039,119.3275169088448,0.01},
			{5.7365174079238335,116.52400597676836,0.01},
			{5.755471200400905,113.72275486242785,0.01},
			{5.773958241330374,110.92224557681618,0.01},
			{5.791978415596582,108.1210455972494,0.01},
			{5.809531383839868,105.31780945971502,0.01},
			{5.826616597120041,102.51127968103661,0.01},
			{5.843233311731087,99.70028766627546,0.01},
			{5.859380604102241,96.88375422692681,0.01},
			{5.875057385729592,94.06068976410609,0.01},
			{5.890262418118816,91.23019433534407,0.01},
			{5.904994327674031,88.39145733129368,0.01},
			{5.9192516204982475,85.54375694529463,0.01},
			{5.93303269706736,82.68645941467813,0.01},
			{5.946335866729714,79.8190179741249,0.01},
			{5.959163865842021,76.96799467384123,0.01},
			{5.971524144397939,74.16167133550736,0.01},
			{5.983424398918808,71.4015271252117,0.01},
			{5.994872349130044,68.68770126742038,0.01},
			{6.005875747776345,66.02039187780687,0.01},
			{6.016442389311594,63.39984921149262,0.01},
			{6.026580117538145,60.82636935930439,0.01},
			{6.036296832214255,58.300288056662154,0.01},
			{6.045600494723414,55.821975054952055,0.01},
			{6.0544991328273445,53.391828623585866,0.01},
			{6.063000844575691,51.010270490076245,0.01},
			{6.071113801417012,48.67774104793006,0.01},
			{6.078846250572589,46.39469493345889,0.01},
			{6.086206516721572,44.16159689389944,0.01},
			{6.093203003047264,41.97891795414866,0.01},
			{6.099844191702938,39.84713193404657,0.01},
			{6.106138643741863,37.766712233551864,0.01},
			{6.112094998559447,35.73812890550055,0.01},
			{6.117721972898029,33.76184603149563,0.01},
			{6.123028359458164,31.8383193608123,0.01},
			{6.128023025155652,29.967994184923025,0.01},
			{6.132714909075422,28.1513035186236,0.01},
			{6.137113020152609,26.388666463118156,0.01},
			{6.141226434625343,24.680486836409504,0.01},
			{6.1450642932914965,23.02715199691933,0.01},
			{6.14863579860624,21.429031888463804,0.01},
			{6.151950211651739,19.886478272991,0.01},
			{6.155016849008652,18.399824141474678,0.01},
			{6.1578450795605555,16.969383311425585,0.01},
			{6.16044432125316,15.595450155628525,0.01},
			{6.1628240378390196,14.278299515155991,0.01},
			{6.164993735626168,13.018186722889851,0.01},
			{6.166962960253943,11.815347766651607,0.01},
			{6.168741293515013,10.66999956642149,0.01},
			{6.170338350242638,9.582340365747037,0.01},
			{6.171763775276796,8.552550204948556,0.01},
			{6.173027240527345,7.580791503294409,0.01},
			{6.174138442144835,6.66720970493674,0.01},
			{6.175107097811939,5.811934002622909,0.01},
			{6.175942944166529,5.015078127544551,0.01},
			{6.1766557343646316,4.276741188613222,0.01},
			{6.177255235792344,3.597008566270726,0.01},
			{6.177751227933154,2.9759528448632047,0.01},
			{6.178153500397081,2.4136347835657888,0.01},
			{6.178471851116367,1.9101043157135713,0.01},
			{6.178716084712208,1.4654015750422578,0.01},
			{6.178896011035703,1.0795579409736717,0.01},
			{6.179021443885911,0.7525971012446617,0.01},
			{6.17910219990695,0.484536126233227,0.01},
			{6.1791480976657756,0.27538655295244246,0.01},
			{6.1791689569116865,0.1251554754645321,0.01},
			{6.179174598018254,0.03384663940559014,0.01},
			{6.179174841608084,0.0014615389806264293,0.01},
			{6.179174841608084,0.0,0.01},

	};
}