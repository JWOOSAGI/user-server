import axios from 'axios';
import { createSlice } from "@reduxjs/toolkit";
import { IBoard } from '../model/board';
import { findAllBoards, findBoardById } from './board-service';

const boardThunks = [findAllBoards]

interface BoardState{
    json?: IBoard
    array?: Array<IBoard>
}

export const initialState:BoardState = {
    json: {} as IBoard,
    array: []
}
const status = {
    pending: 'pending',
    fulfilled: 'fulfilled',
    rejected: 'rejected'
}

const handleFulfilled =  (state: any, {payload}: any) => {
    console.log('------------------Board conclusion ---------------')
    state.array = payload
    console.log(state.array)

}

const handlePending = (state: any) => {
  
}
const handleRejected = (state: any) => {
  
}

export const boardSlice = createSlice({
    name: "boards",
    initialState,
    reducers: {},
    extraReducers: builder => {
        const {pending, rejected} = status;

        builder
        .addCase(findAllBoards.fulfilled, handleFulfilled)
        .addCase(findBoardById.fulfilled, (state:any,{payload} : any) => {state.array = payload})
    }
})
export const getAllBoards = (state: any) => { return state.board.array;}
export const getBoardNames = (state: any) => {return state.board.array.map((board: any) => board.name);}
export const getSingleBoard = (state:any) => (state.board.json)
export const {} = boardSlice.actions

export default boardSlice.reducer;