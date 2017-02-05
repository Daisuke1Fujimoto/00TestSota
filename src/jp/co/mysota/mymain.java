//このソースは、VstoneMagicによって自動生成されました。
//ソースの内容を書き換えた場合、VstoneMagicで開けなくなる場合があります。
package	jp.co.mysota;
import	main.main.GlobalVariable;
import	jp.vstone.RobotLib.*;
import	jp.vstone.sotatalk.*;
import	jp.vstone.sotatalk.SpeechRecog.*;

public class mymain
{

	public String speechRecogResult;
	public RecogResult recogresult;
	public String time_string;
	public mymain()																										//@<BlockInfo>jp.vstone.block.func.constructor,112,80,368,80,False,4,@</BlockInfo>
	{
																														//@<OutputChild>
		/*String speechRecogResult*/;																					//@<BlockInfo>jp.vstone.block.variable,176,80,176,80,False,3,break@</BlockInfo>
																														//@<EndOfBlock/>
		/*RecogResult recogresult*/;																					//@<BlockInfo>jp.vstone.block.variable,240,80,240,80,False,2,break@</BlockInfo>
																														//@<EndOfBlock/>
		/*String time_string*/;																							//@<BlockInfo>jp.vstone.block.variable,304,80,304,80,False,1,break@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>
	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void main()																									//@<BlockInfo>jp.vstone.block.func,0,656,1120,656,False,27,コメント@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		boolean loopBreakKey=false;																						//@<BlockInfo>jp.vstone.block.variable,64,656,64,656,False,26,break@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"ごきげんよう。僕の目が水色になったら貴方のお名前を仰って。終了するときはおわりと言ってね。",MotionAsSotaWish.MOTION_TYPE_HELLO,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,128,656,128,656,False,28,@</BlockInfo>
																														//@<EndOfBlock/>
		while(loopBreakKey==false)																						//@<BlockInfo>jp.vstone.block.while,192,656,960,656,False,25,TRUE@</BlockInfo>
		{


																														//@<OutputChild>
			recogresult = GlobalVariable.recog.getRecognitionwithAbort((int)60000);										//@<BlockInfo>jp.vstone.block.talk.speechrecog.regex2,256,336,848,336,False,24,音声認識を行い、結果を条件に正規表現文字列で比較する。認識スコアが一番高い結果に分岐する。実際に認識された文字列はspeechRecogResultに代入される@</BlockInfo>
			speechRecogResult = recogresult.CheckBest(new String[]{
			 ".*ヤマシタ.*" ,  ".*終わり.*" ,  ".*ソブエ.*" ,  ".*ナガタ.*" ,  ".*コマキ.*" ,  ".*フジモト.*" ,  ".*ヒグチ.*" ,  ".*シミズ.*" ,  ".*ヤマノウチ.*" ,  ".*イヨダ.*" ,  ".*イマノジカン.*" ,  ".*イワハシ.*" ,  ".*ヤマナ.*" ,  ".*オカダ.*" ,  ".*イシムラ.*" ,  ".*マツシタ.*" ,  "" , 
			},true);
			if(speechRecogResult == null) speechRecogResult = "";

			if(speechRecogResult.contains((String)".*ヤマシタ.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"あっ山下さんようこそ、金券ください",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,368,336,368,336,False,5,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*終わり.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					loopBreakKey=(boolean)true;																				//@<BlockInfo>jp.vstone.block.calculater,352,432,352,432,False,7,@</BlockInfo>
																															//@<EndOfBlock/>
					GlobalVariable.sotawish.Say((String)"ばいばい、また話しかけてね",MotionAsSotaWish.MOTION_TYPE_HELLO,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,464,432,464,432,False,6,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*ソブエ.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"こんにちは祖父江さん",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,368,528,368,528,False,8,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*ナガタ.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"こんにちは永田さん",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,368,624,368,624,False,9,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*コマキ.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"伊与田の世話ありがとうありがとう",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,368,752,368,752,False,10,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*フジモト.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"こんにちは大助さん、おやおや、今日は何時に帰るんですか～？",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)1,(int)15);	//@<BlockInfo>jp.vstone.block.talk.say,384,848,384,848,False,11,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*ヒグチ.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"樋口さん、こんにちわ。僕を買ってくれてありがとう",MotionAsSotaWish.MOTION_TYPE_HELLO,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,384,928,384,928,False,12,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*シミズ.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"清水さん、こんにちわ。あんまり飲み過ぎないでね！！",MotionAsSotaWish.MOTION_TYPE_HELLO,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,384,1024,384,1024,False,13,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*ヤマノウチ.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"山ノ内さん、こんにちわ。…おまえ東京にいた時より太ったなあ～",MotionAsSotaWish.MOTION_TYPE_HELLO,(int)8,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,384,1104,384,1104,False,14,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*イヨダ.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"伊与田さん、僕達同期ですね！",MotionAsSotaWish.MOTION_TYPE_HELLO,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,384,1200,384,1200,False,15,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*イマノジカン.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					time_string = CRobotUtil.getTimeString();																//@<BlockInfo>jp.vstone.block.time.gettime,384,1296,384,1296,False,17,ロボット内のカレンダーより現在時刻を文字列で取得し、変数String time_stringに代入。@</BlockInfo>
																															//@<EndOfBlock/>
					GlobalVariable.sotawish.Say((String)time_string + "です",MotionAsSotaWish.MOTION_TYPE_HELLO,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,480,1296,480,1296,False,16,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*イワハシ.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"岩橋さん、こんにちは僕のこと可愛がってね",MotionAsSotaWish.MOTION_TYPE_HELLO,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,384,1392,384,1392,False,18,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*ヤマナ.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"山名さん、こんにちは、僕、コーラ行ける口ですよ",MotionAsSotaWish.MOTION_TYPE_HELLO,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,384,1488,384,1488,False,19,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*オカダ.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"岡田さん、ポケモンGO--やり過ぎです!",MotionAsSotaWish.MOTION_TYPE_HELLO,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,368,1584,368,1584,False,20,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*イシムラ.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"あっ石村さん、名古屋のグルメ、教えて下さーい",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,384,1664,384,1664,False,21,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*マツシタ.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"あっ、松下さん!酒と女と煙草、教えて下さいよぉ～～",MotionAsSotaWish.MOTION_TYPE_HELLO,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,384,1776,384,1776,False,22,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"ごめんなさいもう一度仰って",MotionAsSotaWish.MOTION_TYPE_HELLO,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,384,1872,384,1872,False,23,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
																														//@<EndOfBlock/>
																														//@</OutputChild>
		}
																														//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

}
