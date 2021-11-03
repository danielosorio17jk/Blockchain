package com.uniminuto.blockchain;

import java.util.ArrayList;
import java.util.Date;

public class Main {

	ArrayList<Block> bloqueArray = new ArrayList<Block>();
	ArrayList<Datos> data = new ArrayList<Datos>();
	StringUtil stringUtil = new StringUtil();
	//Block block = new Block();

	int difficulty = 2;
        /**
         * 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		if(main.validaTransacciones("Daniel", "", 600000, new Date())) {
			main.crearBloque();
		}
		if(main.validaTransacciones("Fernando", "", 500000, new Date())) {
			main.crearBloque();
		}
		if(main.validaTransacciones("Osorio", "", 400000, new Date())) {
			main.crearBloque();
		}

		// main.imprimir(main.bloqueArray);

		if(main.validaTransacciones("Assly", "", 600000, new Date())) {
			main.crearBloque();
		}
		if(main.validaTransacciones("Daniel", "", 500000, new Date())) {
			main.crearBloque();
		}
		if(main.validaTransacciones("Sanchez", "", 400000, new Date())) {
			main.crearBloque();
		}
		if(main.validaTransacciones("Sanchez2", "", 400000, new Date())) {
			main.crearBloque();
		}
		if(main.validaTransacciones("Fernando2", "", 500000, new Date())) {
			main.crearBloque();
		}
		if(main.validaTransacciones("Osorio2", "", 400000, new Date())) {
			main.crearBloque();
		}
		//main.imprimir(main.data);
		main.imprimir(main.bloqueArray);
		System.out.println(main.consultaSaldo("Daniel"));

		// System.out.println(main.bloqueArray.size());
		// System.out.println(main.data.size());
	}
        * 
         * @param args 
         */

	public boolean validaTransacciones(String emisor, String receptor, int valor, Date fecha) {
		Datos datos = new Datos();
		datos.setEmisor(emisor);
		datos.setFecha(fecha);
		datos.setReceptor(receptor);
		datos.setValor(valor);
		data.add(datos);
		//int remainder = a % b;
		if ((data.size() % 3) == 0) {
			return true;
		}
		return false;

	}
	public int consultaSaldo(String emisor) {
		int resultado = 0;

		for (int i = 0; i < bloqueArray.size(); i++) {
			ArrayList<Datos> datosArray = bloqueArray.get(i).getData();
			for (int j = 0; j < datosArray.size(); j++) {
				if (datosArray.get(j).getEmisor().equalsIgnoreCase(emisor)) {
					resultado = datosArray.get(j).getValor() + resultado;
				}

			}

		}

		return resultado;
	}

	public boolean crearBloque() {
		ArrayList<Datos> datos = new ArrayList<Datos>();
		Block block = new Block();
		//block.setData(data);
		if (bloqueArray.isEmpty() || bloqueArray == null) {
			datos.add(data.get(0));
			datos.add(data.get(1));
			datos.add(data.get(2));
			block.setData(datos);
			block.setPreviousHash("0");
			block.setNonce(0);
			block.setTimeStamp(new Date().getTime());
			block.setHash(calculateHash(block));
			mineBlock(difficulty, block);
			bloqueArray.add(block);
			
			return true;

		} else {
			datos.add(data.get(data.size()-1));
			datos.add(data.get(data.size()-2));
			datos.add(data.get(data.size()-3));
			block.setData(datos);
			block.setPreviousHash(bloqueArray.get(bloqueArray.size() - 1).getHash());
			block.setNonce(0);
			block.setTimeStamp(new Date().getTime());
			block.setHash(calculateHash(block));
			mineBlock(difficulty, block);
			bloqueArray.add(block);
			return true;
		}
	}

	
	public String calculateHash(Block block) {
		String calculatedhash = stringUtil.applySha256(
				block.getPreviousHash() + Long.toString(block.getTimeStamp()) + block.getNonce() + block.getData());
		return calculatedhash;
	}

	public void mineBlock(int difficulty, Block block) {
		String target = stringUtil.getDificultyString(difficulty); // Create a string with difficulty * "0"
		int nonce = block.getNonce();
		String hash = block.getHash();
		while (!hash.substring(0, difficulty).equals(target)) {
			nonce++;
			hash = calculateHash(block);
			block.setNonce(nonce);
			block.setHash(hash);
		}
		// System.out.println("Block Mined!!! : " + hash);

	}

	public void imprimir(Object datos) {
		String blockchainJson = stringUtil.getJson(datos);
		System.out.println(blockchainJson);
	}

}
