package com.uniminuto.blockchain;

import java.util.ArrayList;

public class Block {

	public String hash;
	public String previousHash;
	public ArrayList<Datos> data; // our data will be a simple message.
	public long timeStamp; // as number of milliseconds since 1/1/1970.
	public int nonce;

	
	
	public Block() {
	}


	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getPreviousHash() {
		return previousHash;
	}

	public void setPreviousHash(String previousHash) {
		this.previousHash = previousHash;
	}

	public ArrayList<Datos> getData() {
		return data;
	}

	public void setData(ArrayList<Datos> data) {
		this.data = new ArrayList<Datos>(data);
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public int getNonce() {
		return nonce;
	}

	public void setNonce(int nonce) {
		this.nonce = nonce;
	}

	public String toString() {
		return data.toString();
	}

	
	
	
	
	

}
