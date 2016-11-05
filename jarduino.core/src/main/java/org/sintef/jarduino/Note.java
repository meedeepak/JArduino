/**
 * Author(s): Jainil Sutaria
 * Date Created: Nov. 4, 2016
 * Date Edited: Nov. 4, 2016
 */
package org.sintef.jarduino;

public enum Note {
	B0((short)31),
	C1((short)33),
	CS1((short)35),
	D1((short)37),
	DS1((short)39),
	E1((short)41),
	F1((short)44),
	FS1((short)46),
	G1((short)49),
	GS1((short)52),
	A1((short)55),
	AS1((short)58),
	B1((short)62),
	C2((short)65),
	CS2((short)69),
	D2((short)73),
	DS2((short)78),
	E2((short)80),
	F2((short)87),
	FS2((short)93),
	G2((short)98),
	GS2((short)104),
	A2((short)110),
	AS2((short)117),
	B2((short)123),
	C3((short)131),
	CS3((short)139),
	D3((short)147),
	DS3((short)156),
	E3((short)165),
	F3((short)175),
	FS3((short)185),
	G3((short)196),
	GS3((short)208),
	A3((short)220),
	AS3((short)233),
	B3((short)247),
	C4((short)262),
	CS4((short)277),
	D4((short)294),
	DS4((short)311),
	E4((short)330),
	F4((short)349),
	FS4((short)370),
	G4((short)392),
	GS4((short)415),
	A4((short)440),
	AS4((short)466),
	B4((short)494),
	C5((short)523),
	CS5((short)554),
	D5((short)587),
	DS5((short)622),
	E5((short)659),
	F5((short)698),
	FS5((short)740),
	G5((short)784),
	GS5((short)831),
	A5((short)880),
	AS5((short)932),
	B5((short)988),
	C6((short)1047),
	CS6((short)1109),
	D6((short)1175),
	DS6((short)1245),
	E6((short)1319),
	F6((short)1397),
	FS6((short)1480),
	G6((short)1568),
	GS6((short)1661),
	A6((short)1760),
	AS6((short)1865),
	B6((short)1976),
	C7((short)2093),
	CS7((short)2217),
	D7((short)2349),
	DS7((short)2489),
	E7((short)2637),
	F7((short)2794),
	FS7((short)2960),
	G7((short)3136),
	GS7((short)3322),
	A7((short)3520),
	AS7((short)3729),
	B7((short)3951),
	C8((short)4186),
	CS8((short)4435),
	D8((short)4699),
	DS8((short)4978);
	
	private short frequency;
	
	private Note(short fr) {
		this.frequency = fr;
	}

	public short getFrequency() {
		return frequency;
	}
}
